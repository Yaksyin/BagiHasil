package profitShare.Profit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MSavingTxTypeCoaRequest {
    private String id;
    private String txCode;
    private String coaCode;
    private String mutation;
    private BigDecimal nominal;
    private String description;
    private Timestamp CreatedAt;
    private String savingTxTypeId;
}
