package pl.codeschenker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.codeschenker.model.dto.PointDto;
import pl.codeschenker.service.DeliveryService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping(value = "/details/{id}", produces = "application/json")
    public PointDto findOne (@PathVariable(name = "id") Long id) {
        return deliveryService.findOne(id);
    }

}
