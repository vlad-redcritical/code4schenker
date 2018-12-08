package org.code4schener.route.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import org.code4schener.route.domain.ParamLog;

/**
 * = ParamLogRepositoryImpl
 *
 * Implementation of ParamLogRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ParamLogRepositoryCustom.class)
public class ParamLogRepositoryImpl extends QueryDslRepositorySupportExt<ParamLog> implements ParamLogRepositoryCustom{

    /**
     * Default constructor
     */
    ParamLogRepositoryImpl() {
        super(ParamLog.class);
    }
}