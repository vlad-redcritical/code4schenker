package pl.codeschenker.service;

import pl.codeschenker.model.dto.ParamLogDto;

import java.util.List;

public interface DeliveryService {

	List<ParamLogDto> findAll();

}
