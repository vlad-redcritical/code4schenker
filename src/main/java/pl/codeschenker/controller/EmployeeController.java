package pl.codeschenker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.codeschenker.model.dto.ParamLogDto;
import pl.codeschenker.service.DeliveryService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping(value = "/details", produces = "application/json")
    public List<ParamLogDto> findAll() {
        return deliveryService.findAll();
    }

}
