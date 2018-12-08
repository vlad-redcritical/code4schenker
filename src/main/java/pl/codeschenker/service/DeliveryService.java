package pl.codeschenker.service;

import pl.codeschenker.model.dto.ParamLogDto;
import pl.codeschenker.model.dto.PointDto;

import java.util.List;

public interface DeliveryService {

	List<PointDto> findAll();

}
