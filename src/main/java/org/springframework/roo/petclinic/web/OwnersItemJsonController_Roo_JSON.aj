// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springframework.roo.petclinic.web;

import io.springlets.web.NotFoundException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.roo.petclinic.domain.Owner;
import org.springframework.roo.petclinic.service.api.OwnerService;
import org.springframework.roo.petclinic.web.OwnersItemJsonController;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

privileged aspect OwnersItemJsonController_Roo_JSON {
    
    declare @type: OwnersItemJsonController: @RestController;
    
    declare @type: OwnersItemJsonController: @RequestMapping(value = "/owners/{owner}", name = "OwnersItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private OwnerService OwnersItemJsonController.ownerService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param ownerService
     */
    @Autowired
    public OwnersItemJsonController.new(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return OwnerService
     */
    public OwnerService OwnersItemJsonController.getOwnerService() {
        return ownerService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ownerService
     */
    public void OwnersItemJsonController.setOwnerService(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Owner
     */
    @ModelAttribute
    public Owner OwnersItemJsonController.getOwner(@PathVariable("owner") Long id) {
        Owner owner = ownerService.findOne(id);
        if (owner == null) {
            throw new NotFoundException(String.format("Owner with identifier '%s' not found",id));
        }
        return owner;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param owner
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> OwnersItemJsonController.show(@ModelAttribute Owner owner) {
        return ResponseEntity.ok(owner);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param owner
     * @return UriComponents
     */
    public static UriComponents OwnersItemJsonController.showURI(Owner owner) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(OwnersItemJsonController.class).show(owner))
            .buildAndExpand(owner.getId()).encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storedOwner
     * @param owner
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(name = "update")
    public ResponseEntity<?> OwnersItemJsonController.update(@ModelAttribute Owner storedOwner, @Valid @RequestBody Owner owner, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        owner.setId(storedOwner.getId());
        getOwnerService().save(owner);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param owner
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> OwnersItemJsonController.delete(@ModelAttribute Owner owner) {
        getOwnerService().delete(owner);
        return ResponseEntity.ok().build();
    }
    
}
