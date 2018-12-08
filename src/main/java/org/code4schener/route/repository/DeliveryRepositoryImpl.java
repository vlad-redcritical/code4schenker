package org.code4schener.route.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import org.code4schener.route.domain.Delivery;

/**
 * = DeliveryRepositoryImpl
 *
 * Implementation of DeliveryRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = DeliveryRepositoryCustom.class)
public class DeliveryRepositoryImpl extends QueryDslRepositorySupportExt<Delivery> implements DeliveryRepositoryCustom{

    /**
     * Default constructor
     */
    DeliveryRepositoryImpl() {
        super(Delivery.class);
    }
}