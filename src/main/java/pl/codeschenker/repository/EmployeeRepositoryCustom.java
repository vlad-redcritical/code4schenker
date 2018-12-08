package pl.codeschenker.repository;

import pl.codeschenker.model.EmployeeEntity;
import pl.codeschenker.model.FilterSearchCriteriaDto;

import java.util.List;

public interface EmployeeRepositoryCustom {

	List<EmployeeEntity> findByCriteria(FilterSearchCriteriaDto searchCriteriaDto);

}
