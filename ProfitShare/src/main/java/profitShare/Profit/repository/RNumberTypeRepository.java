package profitShare.Profit.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import profitShare.Profit.entity.RNumberType;

@Repository
public interface RNumberTypeRepository extends JpaRepository<RNumberType, String> {
}
