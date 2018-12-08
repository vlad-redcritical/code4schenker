package org.code4schener.route.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.code4schener.route.domain.DeliveryParam;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = DeliveryParamRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = DeliveryParam.class)
public interface DeliveryParamRepository extends DetachableJpaRepository<DeliveryParam, Long>, DeliveryParamRepositoryCustom {
}
