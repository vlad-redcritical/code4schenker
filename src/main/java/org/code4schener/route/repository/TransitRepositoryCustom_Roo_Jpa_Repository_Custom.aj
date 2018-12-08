// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.code4schener.route.repository;

import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.code4schener.route.domain.Delivery;
import org.code4schener.route.domain.Transit;
import org.code4schener.route.repository.TransitRepositoryCustom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect TransitRepositoryCustom_Roo_Jpa_Repository_Custom {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param delivery
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Transit> TransitRepositoryCustom.findByDelivery(Delivery delivery, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Transit> TransitRepositoryCustom.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Transit> TransitRepositoryCustom.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
}
