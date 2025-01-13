package profitShare.Profit.service;

import profitShare.Profit.dto.AverageProfitShareResponse;
import profitShare.Profit.dto.AverageProfitshareDetail;
import profitShare.Profit.dto.TSavingAccountRequest;

import java.util.List;

public interface ProfitShareService {

    List<AverageProfitShareResponse> processAndSaveProfitShare(TSavingAccountRequest tSavingAccountRequest);
}
