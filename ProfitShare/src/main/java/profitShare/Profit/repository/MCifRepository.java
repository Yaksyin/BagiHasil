package profitShare.Profit.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import profitShare.Profit.entity.MCif;

@Repository
public interface MCifRepository extends JpaRepository<MCif, String> {
}
