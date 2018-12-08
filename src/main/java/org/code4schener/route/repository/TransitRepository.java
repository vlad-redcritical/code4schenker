package org.code4schener.route.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.code4schener.route.domain.Transit;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = TransitRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Transit.class)
public interface TransitRepository extends DetachableJpaRepository<Transit, Long>, TransitRepositoryCustom {
}
