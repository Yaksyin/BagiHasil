package profitShare.Profit.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import profitShare.Profit.entity.MSaving;


@Repository
public interface MSavingRepository extends JpaRepository<MSaving, String> {
@Query(value = "SELECT saving_id \n" +
        "FROM m_saving ms \n" +
        "WHERE ms.saving_id = :savingId OR :savingId IS NULL",nativeQuery = true)
    MSaving findBySavingId(String savingId);
}
