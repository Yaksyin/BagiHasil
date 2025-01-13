package profitShare.Profit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TJuranalLedgerRequest {

    private String txCode;
    private String coaCode;
    private BigDecimal nominal;
    private String description;


}
