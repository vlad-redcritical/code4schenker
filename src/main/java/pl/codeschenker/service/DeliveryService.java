package pl.codeschenker.service;

import pl.codeschenker.model.dto.PointDto;
import pl.codeschenker.model.dto.SettingsDto;

import java.util.List;

public interface DeliveryService {

	PointDto findOne(Long id);

	List<SettingsDto> findByCriteria(Long id);


}
