package org.code4schener.route.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import org.code4schener.route.domain.Transit;

/**
 * = TransitRepositoryImpl
 *
 * Implementation of TransitRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = TransitRepositoryCustom.class)
public class TransitRepositoryImpl extends QueryDslRepositorySupportExt<Transit> implements TransitRepositoryCustom{

    /**
     * Default constructor
     */
    TransitRepositoryImpl() {
        super(Transit.class);
    }
}