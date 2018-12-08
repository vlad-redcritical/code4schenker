package pl.codeschenker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.codeschenker.model.dto.ParamLogDto;
import pl.codeschenker.model.ParamLogEntity;
import pl.codeschenker.repository.DeliveryRepository;
import pl.codeschenker.service.DeliveryService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class DeliveryServiceImpl implements DeliveryService {

	@Autowired
	DeliveryRepository deliveryRepository;


	@Override
	public List<ParamLogDto> findAll() {
		return deliveryRepository.findAll().stream().map(this::mapToDto).collect(Collectors.toList());
	}


	private ParamLogDto mapToDto(ParamLogEntity paramLogEntity) {
		ParamLogDto paramLogDto = new ParamLogDto();
		paramLogDto.setId(paramLogEntity.getId());
		paramLogDto.setValue(paramLogEntity.getValue());
		return paramLogDto;
	}
}
