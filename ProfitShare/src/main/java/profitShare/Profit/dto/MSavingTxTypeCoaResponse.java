package profitShare.Profit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MSavingTxTypeCoaResponse {

    private String txCode;
    private String coaCode;
    private BigDecimal nominal;
    private String description;

}
