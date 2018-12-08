package pl.codeschenker.service;

import pl.codeschenker.model.EmployeeEntityDto;
import pl.codeschenker.model.FilterSearchCriteriaDto;

import java.util.List;

public interface EmployeeService {

	List<EmployeeEntityDto> findByCriteria(FilterSearchCriteriaDto searchCriteriaDto);

	List<EmployeeEntityDto> findAll();

	void save(EmployeeEntityDto employeeEntityDto);

	EmployeeEntityDto findOne(Long employeeId);

	void delete(Long employeeId);
}
