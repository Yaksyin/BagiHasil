package profitShare.Profit.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import profitShare.Profit.dto.AverageProfitShareResponse;
import profitShare.Profit.entity.ProfitShare;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Repository
public interface ProfitShareRepository extends JpaRepository<ProfitShare, String> {

    @Query(value = "SELECT reference.saving_account_id, " +
            "reference.saldoRataRata * (reference.profit_percentage / 100) AS nominalProfitShare " +
            "FROM ( " +
            "    SELECT tsad.saving_account_id, " +
            "           SUM(tsad.balance) / :numberOfDays AS saldoRataRata, " +
            "           ms.profit_share_balance, " +
            "           ms.profit_percentage " +
            "    FROM t_saving_account_detail tsad " +
            "    JOIN t_saving_account tsa ON tsad.saving_account_id = tsa.saving_account_id " +
            "    JOIN m_saving ms ON tsa.saving_id = ms.saving_id " +
            "    WHERE TO_CHAR(tsad.created_at, 'MM-YYYY') = :period " +
            "      AND tsa.status_id = :statusActive " +
            "      AND tsa.is_deleted = FALSE " +
            "      AND ms.profit_share_balance > 0 " +
            "      AND ms.profit_percentage > 0 " +
            "    GROUP BY tsad.saving_account_id, TO_CHAR(tsad.created_at, 'MM-YYYY'), " +
            "             tsa.saving_account_id, ms.saving_id " +
            ") AS reference " +
            "WHERE reference.saldoRataRata >= reference.profit_share_balance",
            nativeQuery = true)
    List<AverageProfitShareResponse> averageProfitShare(@Param("numberOfDays") int numberOfDays,
                                                        @Param("period") String period,
                                                        @Param("statusActive") String statusActive);

}
