package profitShare.Profit.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import profitShare.Profit.entity.MUser;

@Repository
public interface MUserRepository extends JpaRepository<MUser, String> {
}
