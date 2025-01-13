package profitShare.Profit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TJurnalLedgerResponse {
    private String id;
    private String txCode;
    private String coaCode;
    private String mutation;
    private BigDecimal nominal;
    private String description;
    private Timestamp createdAt;
    private String savingTxTypeId;
}
