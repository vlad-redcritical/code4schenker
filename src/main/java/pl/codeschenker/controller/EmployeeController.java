package pl.codeschenker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.codeschenker.model.FilterType;
import pl.codeschenker.model.EmployeeEntityDto;
import pl.codeschenker.model.FilterSearchCriteriaDto;
import pl.codeschenker.service.EmployeeService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/all", produces = "application/json")
    public List<EmployeeEntityDto> findAll() {
        return employeeService.findAll();
    }

    @PostMapping(value = "/create")
    public ResponseEntity createEmployee(@Valid @RequestBody EmployeeEntityDto employee) {
        employeeService.save(employee);
        return new ResponseEntity("Employee created successfully", HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<EmployeeEntityDto> updateEmployee(@PathVariable(value = "id") Long employeeId,
                                                            @Valid @RequestBody EmployeeEntityDto employeeDto) {
        final EmployeeEntityDto resultDto = employeeService.findOne(employeeId);
        if (resultDto == null) {
            return ResponseEntity.notFound().build();
        }
        resultDto.setId(employeeId);
        resultDto.setName(employeeDto.getName() != null ? employeeDto.getName() : null);
        resultDto.setLastname(employeeDto.getLastname() != null ? employeeDto.getLastname() : null);
        resultDto.setEmail(employeeDto.getEmail() != null ? employeeDto.getEmail() : null);
        resultDto.setPosition(employeeDto.getPosition() != null ? employeeDto.getPosition() : null);
        employeeService.save(resultDto);
        return new ResponseEntity("Employee updated successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<EmployeeEntityDto> deleteEmployee(@PathVariable(value = "id") Long employeeId) {
        final EmployeeEntityDto resultDto = employeeService.findOne(employeeId);
        if (resultDto == null) {
            return ResponseEntity.notFound().build();
        }
        employeeService.delete(employeeId);
        return new ResponseEntity("Employee deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/filter", produces = "application/json")
    public ResponseEntity<List<EmployeeEntityDto>> findByIds(@RequestBody FilterSearchCriteriaDto searchCriteriaDto) {
        if (!FilterType.parse(searchCriteriaDto.getSearchType()).isPresent()) {
            return new ResponseEntity("Search type not valid", HttpStatus.BAD_REQUEST);
        }
        List<EmployeeEntityDto> result = employeeService.findByCriteria(searchCriteriaDto);
        return ResponseEntity.ok(result);
    }
}
