// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.code4schener.route.service.api;

import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.code4schener.route.domain.LocationLog;
import org.code4schener.route.service.api.LocationLogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect LocationLogService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return LocationLog
     */
    public abstract LocationLog LocationLogService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param locationLog
     */
    public abstract void LocationLogService.delete(LocationLog locationLog);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<LocationLog> LocationLogService.save(Iterable<LocationLog> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void LocationLogService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return LocationLog
     */
    public abstract LocationLog LocationLogService.save(LocationLog entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return LocationLog
     */
    public abstract LocationLog LocationLogService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<LocationLog> LocationLogService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<LocationLog> LocationLogService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long LocationLogService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<LocationLog> LocationLogService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<LocationLog> LocationLogService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param locationLog
     * @param paramsToAdd
     * @return LocationLog
     */
    public abstract LocationLog LocationLogService.addToParams(LocationLog locationLog, Iterable<Long> paramsToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param locationLog
     * @param paramsToRemove
     * @return LocationLog
     */
    public abstract LocationLog LocationLogService.removeFromParams(LocationLog locationLog, Iterable<Long> paramsToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param locationLog
     * @param params
     * @return LocationLog
     */
    public abstract LocationLog LocationLogService.setParams(LocationLog locationLog, Iterable<Long> params);
    
}
