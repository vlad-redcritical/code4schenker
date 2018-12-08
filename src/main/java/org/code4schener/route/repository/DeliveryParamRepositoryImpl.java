package org.code4schener.route.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import org.code4schener.route.domain.DeliveryParam;

/**
 * = DeliveryParamRepositoryImpl
 *
 * Implementation of DeliveryParamRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = DeliveryParamRepositoryCustom.class)
public class DeliveryParamRepositoryImpl extends QueryDslRepositorySupportExt<DeliveryParam> implements DeliveryParamRepositoryCustom{

    /**
     * Default constructor
     */
    DeliveryParamRepositoryImpl() {
        super(DeliveryParam.class);
    }
}