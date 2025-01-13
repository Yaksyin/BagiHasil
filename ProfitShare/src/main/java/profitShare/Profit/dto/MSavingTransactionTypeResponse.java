package profitShare.Profit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MSavingTransactionTypeResponse {
    private String id;
    private String txCode;
    private String savingId;
}
