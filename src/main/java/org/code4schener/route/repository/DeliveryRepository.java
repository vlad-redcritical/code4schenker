package org.code4schener.route.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.code4schener.route.domain.Delivery;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = DeliveryRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Delivery.class)
public interface DeliveryRepository extends DetachableJpaRepository<Delivery, Long>, DeliveryRepositoryCustom {
}
