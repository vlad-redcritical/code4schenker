package org.code4schener.route.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.code4schener.route.domain.LocationLog;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = LocationLogRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = LocationLog.class)
public interface LocationLogRepository extends DetachableJpaRepository<LocationLog, Long>, LocationLogRepositoryCustom {
}
