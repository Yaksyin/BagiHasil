package profitShare.Profit.service.Impl;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import profitShare.Profit.dto.*;
import profitShare.Profit.entity.*;
import profitShare.Profit.enums.Status;
import profitShare.Profit.repository.ProfitShareRepository;
import profitShare.Profit.repository.TJurnalLedgerRepository;
import profitShare.Profit.repository.TSavingAccountDetailRepository;
import profitShare.Profit.repository.TSavingAccountRepository;
import profitShare.Profit.service.ProfitShareService;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ProfitShareServiceImpl implements ProfitShareService {
    @Autowired
    private ProfitShareRepository profitShareRepository;

    @Autowired
    private TSavingAccountRepository tSavingAccountRepository;

    @Autowired
    private TSavingAccountDetailRepository tSavingAccountDetailRepository;

    @Autowired
    private TJurnalLedgerRepository tJurnalLedgerRepository;




    @Transactional
    @Override
    public List<AverageProfitShareResponse> processAndSaveProfitShare(TSavingAccountRequest tSavingAccountRequest) {
        LocalDate today = LocalDate.now();
        LocalDate firstDayOfMonth = today.withDayOfMonth(1);
        LocalDate lastDayOfMonth = today.withDayOfMonth(today.lengthOfMonth());
        int numberOfDays = (int) ChronoUnit.DAYS.between(firstDayOfMonth, lastDayOfMonth);

        String period = today.getMonth() + "-" + today.getYear();

        List<AverageProfitShareResponse> profitShareData = profitShareRepository.averageProfitShare(numberOfDays, period, Status.ACTIVE.getKey());
        if (profitShareData == null || profitShareData.isEmpty()) {
            log.warn("No data found for processing profit share");
            return List.of();
        }
        return profitShareData
                .stream()
                .map(data -> {
                    TSavingAccountDetail savingAccountDetail = tSavingAccountDetailRepository.findById(data.getTSavingAccountId())
                            .orElseThrow(() -> new RuntimeException("saving account detail not found : " + data.getTSavingAccountId()));
                    savingAccountDetail.setBalance(data.getNominalProfitShare());
                    savingAccountDetail.setCreatedAt(Timestamp.from(Instant.now()));
                    tSavingAccountDetailRepository.save(savingAccountDetail);

                    ProfitShare profitShare = new ProfitShare();
                    profitShare.setProfitShareId(data.getTSavingAccountId());
                    profitShare.setBalance(data.getNominalProfitShare());
                    profitShare.setCreatedAt(Timestamp.from(Instant.now()));
                    profitShareRepository.save(profitShare);

                    log.info("Successfully saved data for ID: {}", data.getTSavingAccountId());

                    AverageProfitShareResponse averageProfitShareResponse = new AverageProfitShareResponse();
                    averageProfitShareResponse.setTSavingAccountId(averageProfitShareResponse.getTSavingAccountId());
                    averageProfitShareResponse.setNominalProfitShare(averageProfitShareResponse.getNominalProfitShare());
                    
                    return averageProfitShareResponse;
                })
                .collect(Collectors.toList());
    }

}


