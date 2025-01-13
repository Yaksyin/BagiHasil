package profitShare.Profit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import profitShare.Profit.entity.TSavingAccount;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AverageProfitShareRequest {
    private TSavingAccount tSavingAccountId;
    private BigDecimal nominalProfitShare;
}
