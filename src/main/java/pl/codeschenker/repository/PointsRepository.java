package pl.codeschenker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.codeschenker.model.PointEntity;

@Repository
public interface PointsRepository extends JpaRepository<PointEntity, Long> {
}
