package profitShare.Profit.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import profitShare.Profit.dto.AverageProfitShareResponse;
import profitShare.Profit.dto.AverageProfitshareDetail;
import profitShare.Profit.dto.TSavingAccountRequest;
import profitShare.Profit.service.ProfitShareService;

import java.util.List;


@RestController
@RequestMapping("/profit-share")
public class  ProfitShareController {

    private final ProfitShareService profitShareService;

    ProfitShareController(ProfitShareService profitShareService){
        this.profitShareService = profitShareService;
    }


    @PostMapping("/process")
    public List<AverageProfitShareResponse> processAndSaveProfitShare(@RequestBody TSavingAccountRequest tSavingAccountRequest) {
        return profitShareService.processAndSaveProfitShare(tSavingAccountRequest);
    }
}
