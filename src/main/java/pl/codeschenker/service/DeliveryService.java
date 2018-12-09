package pl.codeschenker.service;

import pl.codeschenker.model.dto.PointDto;

public interface DeliveryService {

	PointDto findOne(Long id);

}
