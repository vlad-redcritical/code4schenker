package org.code4schener.route.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.code4schener.route.domain.ParamLog;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ParamLogRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ParamLog.class)
public interface ParamLogRepository extends DetachableJpaRepository<ParamLog, Long>, ParamLogRepositoryCustom {
}
