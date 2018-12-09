package pl.codeschenker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.codeschenker.model.dto.PointDto;
import pl.codeschenker.model.dto.SettingsDto;
import pl.codeschenker.service.DeliveryService;

import java.util.List;


@RestController
@RequestMapping("/api")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(value = "/details/{id}", produces = "application/json")
    public PointDto findOne (@PathVariable(name = "id") Long id) {
        return deliveryService.findOne(id);
    }


    @GetMapping(value = "/settings/{id}", produces = "application/json")
    public List<SettingsDto> findAll (@PathVariable(name = "id") Long id){
        return deliveryService.findByCriteria(id);
    }

}
