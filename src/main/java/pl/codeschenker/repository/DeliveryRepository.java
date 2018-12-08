package pl.codeschenker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.codeschenker.model.ParamLogEntity;

@Repository
public interface DeliveryRepository extends JpaRepository<ParamLogEntity, Long>{
}
