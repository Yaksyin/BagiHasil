package profitShare.Profit.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import profitShare.Profit.entity.TSavingAccountDetail;

@Repository
public interface TSavingAccountDetailRepository extends JpaRepository<TSavingAccountDetail, String> {

}
