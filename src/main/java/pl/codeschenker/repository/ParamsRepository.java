package pl.codeschenker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.codeschenker.model.ParamLogEntity;
import pl.codeschenker.model.PointEntity;

import java.util.List;

@Repository
public interface ParamsRepository extends JpaRepository<ParamLogEntity, Long> {

    List<ParamLogEntity> getAllByDeliveryParamEntity_Id(Long id);
}
