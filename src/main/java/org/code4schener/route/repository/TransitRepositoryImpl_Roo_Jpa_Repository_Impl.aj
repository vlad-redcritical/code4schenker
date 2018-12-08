// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.code4schener.route.repository;

import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.code4schener.route.domain.Delivery;
import org.code4schener.route.domain.QTransit;
import org.code4schener.route.domain.Transit;
import org.code4schener.route.repository.TransitRepositoryImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

privileged aspect TransitRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: TransitRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TransitRepositoryImpl.LONGITUDE = "longitude";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TransitRepositoryImpl.LATITUDE = "latitude";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TransitRepositoryImpl.POINT = "point";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TransitRepositoryImpl.DELIVERY = "delivery";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Transit> TransitRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QTransit transit = QTransit.transit;
        
        JPQLQuery<Transit> query = from(transit);
        
        Path<?>[] paths = new Path<?>[] {transit.longitude,transit.latitude,transit.point,transit.delivery};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(LONGITUDE, transit.longitude)
			.map(LATITUDE, transit.latitude)
			.map(POINT, transit.point)
			.map(DELIVERY, transit.delivery);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, transit);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Transit> TransitRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QTransit transit = QTransit.transit;
        
        JPQLQuery<Transit> query = from(transit);
        
        Path<?>[] paths = new Path<?>[] {transit.longitude,transit.latitude,transit.point,transit.delivery};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(transit.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(LONGITUDE, transit.longitude)
			.map(LATITUDE, transit.latitude)
			.map(POINT, transit.point)
			.map(DELIVERY, transit.delivery);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, transit);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param delivery
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Transit> TransitRepositoryImpl.findByDelivery(Delivery delivery, GlobalSearch globalSearch, Pageable pageable) {
        
        QTransit transit = QTransit.transit;
        
        JPQLQuery<Transit> query = from(transit);
        
        Assert.notNull(delivery, "delivery is required");
        
        query.where(transit.delivery.eq(delivery));
        Path<?>[] paths = new Path<?>[] {transit.longitude,transit.latitude,transit.point,transit.delivery};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(LONGITUDE, transit.longitude)
			.map(LATITUDE, transit.latitude)
			.map(POINT, transit.point)
			.map(DELIVERY, transit.delivery);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, transit);
    }
    
}
