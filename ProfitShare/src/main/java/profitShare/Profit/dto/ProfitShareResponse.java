package profitShare.Profit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import profitShare.Profit.entity.MUser;
import profitShare.Profit.entity.RStatus;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfitShareResponse {

    private String profitShareId;
    private String accountNumber;
    private BigDecimal balance;
    private String statusId;
    private boolean isDeleted;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp authorizationAt;
    private MUser createdBy;
    private MUser updatedBy;
    private MUser authorizationBy;



}
