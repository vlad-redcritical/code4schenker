// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.code4schener.route.service.impl;

import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.code4schener.route.domain.Delivery;
import org.code4schener.route.domain.DeliveryParam;
import org.code4schener.route.domain.ParamLog;
import org.code4schener.route.domain.Transit;
import org.code4schener.route.repository.DeliveryRepository;
import org.code4schener.route.service.api.DeliveryParamService;
import org.code4schener.route.service.api.ParamLogService;
import org.code4schener.route.service.api.TransitService;
import org.code4schener.route.service.impl.DeliveryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect DeliveryServiceImpl_Roo_Service_Impl {
    
    declare @type: DeliveryServiceImpl: @Service;
    
    declare @type: DeliveryServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private DeliveryRepository DeliveryServiceImpl.deliveryRepository;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private DeliveryParamService DeliveryServiceImpl.deliveryParamService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ParamLogService DeliveryServiceImpl.paramLogService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private TransitService DeliveryServiceImpl.transitService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param deliveryRepository
     * @param deliveryParamService
     * @param paramLogService
     * @param transitService
     */
    @Autowired
    public DeliveryServiceImpl.new(DeliveryRepository deliveryRepository, @Lazy DeliveryParamService deliveryParamService, @Lazy ParamLogService paramLogService, @Lazy TransitService transitService) {
        setDeliveryRepository(deliveryRepository);
        setDeliveryParamService(deliveryParamService);
        setParamLogService(paramLogService);
        setTransitService(transitService);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return DeliveryRepository
     */
    public DeliveryRepository DeliveryServiceImpl.getDeliveryRepository() {
        return deliveryRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param deliveryRepository
     */
    public void DeliveryServiceImpl.setDeliveryRepository(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return DeliveryParamService
     */
    public DeliveryParamService DeliveryServiceImpl.getDeliveryParamService() {
        return deliveryParamService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param deliveryParamService
     */
    public void DeliveryServiceImpl.setDeliveryParamService(DeliveryParamService deliveryParamService) {
        this.deliveryParamService = deliveryParamService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ParamLogService
     */
    public ParamLogService DeliveryServiceImpl.getParamLogService() {
        return paramLogService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param paramLogService
     */
    public void DeliveryServiceImpl.setParamLogService(ParamLogService paramLogService) {
        this.paramLogService = paramLogService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return TransitService
     */
    public TransitService DeliveryServiceImpl.getTransitService() {
        return transitService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param transitService
     */
    public void DeliveryServiceImpl.setTransitService(TransitService transitService) {
        this.transitService = transitService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param delivery
     * @return Map
     */
    public Map<String, List<MessageI18n>> DeliveryServiceImpl.validate(Delivery delivery) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param delivery
     * @param deliveryParamsToAdd
     * @return Delivery
     */
    @Transactional
    public Delivery DeliveryServiceImpl.addToDeliveryParams(Delivery delivery, Iterable<Long> deliveryParamsToAdd) {
        List<DeliveryParam> deliveryParams = getDeliveryParamService().findAll(deliveryParamsToAdd);
        delivery.addToDeliveryParams(deliveryParams);
        return getDeliveryRepository().save(delivery);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param delivery
     * @param paramsToAdd
     * @return Delivery
     */
    @Transactional
    public Delivery DeliveryServiceImpl.addToParams(Delivery delivery, Iterable<Long> paramsToAdd) {
        List<ParamLog> params = getParamLogService().findAll(paramsToAdd);
        delivery.addToParams(params);
        return getDeliveryRepository().save(delivery);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param delivery
     * @param transitsToAdd
     * @return Delivery
     */
    @Transactional
    public Delivery DeliveryServiceImpl.addToTransits(Delivery delivery, Iterable<Long> transitsToAdd) {
        List<Transit> transits = getTransitService().findAll(transitsToAdd);
        delivery.addToTransits(transits);
        return getDeliveryRepository().save(delivery);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param delivery
     * @param deliveryParamsToRemove
     * @return Delivery
     */
    @Transactional
    public Delivery DeliveryServiceImpl.removeFromDeliveryParams(Delivery delivery, Iterable<Long> deliveryParamsToRemove) {
        List<DeliveryParam> deliveryParams = getDeliveryParamService().findAll(deliveryParamsToRemove);
        delivery.removeFromDeliveryParams(deliveryParams);
        return getDeliveryRepository().save(delivery);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param delivery
     * @param paramsToRemove
     * @return Delivery
     */
    @Transactional
    public Delivery DeliveryServiceImpl.removeFromParams(Delivery delivery, Iterable<Long> paramsToRemove) {
        List<ParamLog> params = getParamLogService().findAll(paramsToRemove);
        delivery.removeFromParams(params);
        return getDeliveryRepository().save(delivery);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param delivery
     * @param transitsToRemove
     * @return Delivery
     */
    @Transactional
    public Delivery DeliveryServiceImpl.removeFromTransits(Delivery delivery, Iterable<Long> transitsToRemove) {
        List<Transit> transits = getTransitService().findAll(transitsToRemove);
        delivery.removeFromTransits(transits);
        return getDeliveryRepository().save(delivery);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param delivery
     * @param deliveryParams
     * @return Delivery
     */
    @Transactional
    public Delivery DeliveryServiceImpl.setDeliveryParams(Delivery delivery, Iterable<Long> deliveryParams) {
        List<DeliveryParam> items = getDeliveryParamService().findAll(deliveryParams);
        Set<DeliveryParam> currents = delivery.getDeliveryParams();
        Set<DeliveryParam> toRemove = new HashSet<DeliveryParam>();
        for (Iterator<DeliveryParam> iterator = currents.iterator(); iterator.hasNext();) {
            DeliveryParam nextDeliveryParam = iterator.next();
            if (items.contains(nextDeliveryParam)) {
                items.remove(nextDeliveryParam);
            } else {
                toRemove.add(nextDeliveryParam);
            }
        }
        delivery.removeFromDeliveryParams(toRemove);
        delivery.addToDeliveryParams(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        delivery.setVersion(delivery.getVersion() + 1);
        return getDeliveryRepository().save(delivery);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param delivery
     * @param params
     * @return Delivery
     */
    @Transactional
    public Delivery DeliveryServiceImpl.setParams(Delivery delivery, Iterable<Long> params) {
        List<ParamLog> items = getParamLogService().findAll(params);
        Set<ParamLog> currents = delivery.getParams();
        Set<ParamLog> toRemove = new HashSet<ParamLog>();
        for (Iterator<ParamLog> iterator = currents.iterator(); iterator.hasNext();) {
            ParamLog nextParamLog = iterator.next();
            if (items.contains(nextParamLog)) {
                items.remove(nextParamLog);
            } else {
                toRemove.add(nextParamLog);
            }
        }
        delivery.removeFromParams(toRemove);
        delivery.addToParams(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        delivery.setVersion(delivery.getVersion() + 1);
        return getDeliveryRepository().save(delivery);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param delivery
     * @param transits
     * @return Delivery
     */
    @Transactional
    public Delivery DeliveryServiceImpl.setTransits(Delivery delivery, Iterable<Long> transits) {
        List<Transit> items = getTransitService().findAll(transits);
        Set<Transit> currents = delivery.getTransits();
        Set<Transit> toRemove = new HashSet<Transit>();
        for (Iterator<Transit> iterator = currents.iterator(); iterator.hasNext();) {
            Transit nextTransit = iterator.next();
            if (items.contains(nextTransit)) {
                items.remove(nextTransit);
            } else {
                toRemove.add(nextTransit);
            }
        }
        delivery.removeFromTransits(toRemove);
        delivery.addToTransits(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        delivery.setVersion(delivery.getVersion() + 1);
        return getDeliveryRepository().save(delivery);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param delivery
     */
    @Transactional
    public void DeliveryServiceImpl.delete(Delivery delivery) {
        // Clear bidirectional one-to-many parent relationship with DeliveryParam
        for (DeliveryParam item : delivery.getDeliveryParams()) {
            item.setDelivery(null);
        }
        
        // Clear bidirectional one-to-many parent relationship with ParamLog
        for (ParamLog item : delivery.getParams()) {
            item.setDelivery(null);
        }
        
        // Clear bidirectional one-to-many parent relationship with Transit
        for (Transit item : delivery.getTransits()) {
            item.setDelivery(null);
        }
        
        getDeliveryRepository().delete(delivery);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<Delivery> DeliveryServiceImpl.save(Iterable<Delivery> entities) {
        return getDeliveryRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void DeliveryServiceImpl.delete(Iterable<Long> ids) {
        List<Delivery> toDelete = getDeliveryRepository().findAll(ids);
        getDeliveryRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return Delivery
     */
    @Transactional
    public Delivery DeliveryServiceImpl.save(Delivery entity) {
        return getDeliveryRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Delivery
     */
    public Delivery DeliveryServiceImpl.findOne(Long id) {
        return getDeliveryRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Delivery
     */
    public Delivery DeliveryServiceImpl.findOneForUpdate(Long id) {
        return getDeliveryRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<Delivery> DeliveryServiceImpl.findAll(Iterable<Long> ids) {
        return getDeliveryRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<Delivery> DeliveryServiceImpl.findAll() {
        return getDeliveryRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long DeliveryServiceImpl.count() {
        return getDeliveryRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Delivery> DeliveryServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getDeliveryRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Delivery> DeliveryServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getDeliveryRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Delivery> DeliveryServiceImpl.getEntityType() {
        return Delivery.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> DeliveryServiceImpl.getIdType() {
        return Long.class;
    }
    
}
