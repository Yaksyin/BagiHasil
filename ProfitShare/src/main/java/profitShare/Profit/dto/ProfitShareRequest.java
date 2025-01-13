package profitShare.Profit.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import profitShare.Profit.entity.RStatus;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfitShareRequest {

    private String accountNumber;
    private BigDecimal balance;
    private String statusId;
    private Boolean isDeleted;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp authorizationAt;
}
