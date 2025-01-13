package profitShare.Profit.dto;


import lombok.Builder;
import lombok.Data;
import profitShare.Profit.entity.MUser;
import profitShare.Profit.entity.RStatus;
import profitShare.Profit.entity.TSavingAccount;


import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Builder
public class TSavingAccountDetailResponse {
    private String savingAccountDetail;
    private TSavingAccount savingAccountId;
    private BigDecimal nominal;
    private String mutation;
    private String destAccountNumber;
    private BigDecimal endBalance;
    private BigDecimal balance;
    private String referenceCode;
    private Timestamp createdAt;

    private MUser userIdDetail;
    private MUser userIdAuthorizationDetail;
    private RStatus statusIdDetail;
}
