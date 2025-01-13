package profitShare.Profit.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import profitShare.Profit.entity.RStatus;

import java.util.Optional;

@Repository
public interface RStatusRespository extends JpaRepository<RStatus, String> {
}
