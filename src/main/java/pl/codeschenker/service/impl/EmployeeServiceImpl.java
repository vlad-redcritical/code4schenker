package pl.codeschenker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.codeschenker.model.EmployeeEntity;
import pl.codeschenker.model.EmployeeEntityDto;
import pl.codeschenker.model.FilterSearchCriteriaDto;
import pl.codeschenker.repository.EmployeeRepository;
import pl.codeschenker.service.EmployeeService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeEntityDto> findByCriteria(FilterSearchCriteriaDto searchCriteriaDto) {
		return employeeRepository.findByCriteria(searchCriteriaDto).stream().map(this::mapToDto).collect(Collectors.toList());
	}

	@Override
	public List<EmployeeEntityDto> findAll() {
		return employeeRepository.findAll().stream().map(this::mapToDto).collect(Collectors.toList());
	}

	@Override
	public void save(EmployeeEntityDto employeeEntityDto) {
		employeeRepository.save(mapToEntity(employeeEntityDto));
	}

	private EmployeeEntity mapToEntity(EmployeeEntityDto dto) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setId(dto.getId());
		employeeEntity.setName(dto.getName());
		employeeEntity.setLastname(dto.getLastname());
		employeeEntity.setEmail(dto.getEmail());
		employeeEntity.setPosition(dto.getPosition());
		return employeeEntity;
	}

	@Override
	public EmployeeEntityDto findOne(Long employeeId) {
		EmployeeEntity result = employeeRepository.findOne(employeeId);
		return mapToDto(result);
	}

	@Override
	public void delete(Long employeeId) {
		employeeRepository.delete(employeeId);

	}

	private EmployeeEntityDto mapToDto(EmployeeEntity employeeEntity) {
		EmployeeEntityDto employeeEntityDto = new EmployeeEntityDto();
		employeeEntityDto.setId(employeeEntity.getId());
		employeeEntityDto.setName(employeeEntity.getName());
		employeeEntityDto.setLastname(employeeEntity.getLastname());
		employeeEntityDto.setEmail(employeeEntity.getEmail());
		employeeEntityDto.setPosition(employeeEntity.getPosition());
		employeeEntityDto.setLastUpdated(employeeEntity.getLastUpdated());
		employeeEntityDto.setDateCreate(employeeEntity.getDateCreate());
		return employeeEntityDto;
	}
}
