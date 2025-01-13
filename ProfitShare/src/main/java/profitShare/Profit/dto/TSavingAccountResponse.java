package profitShare.Profit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TSavingAccountResponse {
    private String savingAccountId;
    private String accountNumber;
    private String cifId; // ID dari MCif
    private BigDecimal beginBalance;
    private BigDecimal endBalance;
    private BigDecimal currentBalance;
    private String statusId; // ID dari RStatus
    private boolean isDeleted;
    private Timestamp authorizationAt;
    private String authorizationBy; // ID dari MUser
    private String savingId; // ID dari MSaving

    // Menambahkan field status dan pesan
    private String message;
    private String status; // Misalnya: "SUCCESS", "ERROR", dll.
}
