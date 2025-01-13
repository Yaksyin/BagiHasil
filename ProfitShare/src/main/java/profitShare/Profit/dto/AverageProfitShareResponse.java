package profitShare.Profit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
public class AverageProfitShareResponse {
    private String tSavingAccountId;
    private BigDecimal nominalProfitShare;
}
