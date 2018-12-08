// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.code4schener.route.repository;

import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.code4schener.route.domain.LocationLog;
import org.code4schener.route.domain.QLocationLog;
import org.code4schener.route.repository.LocationLogRepositoryImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect LocationLogRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: LocationLogRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String LocationLogRepositoryImpl.DATE_TIME = "dateTime";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String LocationLogRepositoryImpl.LONGITUDE = "longitude";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String LocationLogRepositoryImpl.LATITUDE = "latitude";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<LocationLog> LocationLogRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QLocationLog locationLog = QLocationLog.locationLog;
        
        JPQLQuery<LocationLog> query = from(locationLog);
        
        Path<?>[] paths = new Path<?>[] {locationLog.dateTime,locationLog.longitude,locationLog.latitude};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(DATE_TIME, locationLog.dateTime)
			.map(LONGITUDE, locationLog.longitude)
			.map(LATITUDE, locationLog.latitude);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, locationLog);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<LocationLog> LocationLogRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QLocationLog locationLog = QLocationLog.locationLog;
        
        JPQLQuery<LocationLog> query = from(locationLog);
        
        Path<?>[] paths = new Path<?>[] {locationLog.dateTime,locationLog.longitude,locationLog.latitude};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(locationLog.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(DATE_TIME, locationLog.dateTime)
			.map(LONGITUDE, locationLog.longitude)
			.map(LATITUDE, locationLog.latitude);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, locationLog);
    }
    
}
