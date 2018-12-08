package org.code4schener.route.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import org.code4schener.route.domain.LocationLog;

/**
 * = LocationLogRepositoryImpl
 *
 * Implementation of LocationLogRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = LocationLogRepositoryCustom.class)
public class LocationLogRepositoryImpl extends QueryDslRepositorySupportExt<LocationLog> implements LocationLogRepositoryCustom{

    /**
     * Default constructor
     */
    LocationLogRepositoryImpl() {
        super(LocationLog.class);
    }
}