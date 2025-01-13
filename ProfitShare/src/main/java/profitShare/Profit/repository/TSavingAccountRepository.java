package profitShare.Profit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import profitShare.Profit.entity.TSavingAccount;

@Repository
public interface TSavingAccountRepository extends JpaRepository<TSavingAccount, String> {

}
