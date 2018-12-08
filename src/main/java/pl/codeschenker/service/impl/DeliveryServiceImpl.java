package pl.codeschenker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.codeschenker.model.DeliveryEntity;
import pl.codeschenker.model.DeliveryParamEntity;
import pl.codeschenker.model.PointEntity;
import pl.codeschenker.model.dto.DeliveryDto;
import pl.codeschenker.model.dto.DeliveryParamDto;
import pl.codeschenker.model.dto.ParamLogDto;
import pl.codeschenker.model.ParamLogEntity;
import pl.codeschenker.model.dto.PointDto;
import pl.codeschenker.repository.PointRepository;
import pl.codeschenker.service.DeliveryService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class DeliveryServiceImpl implements DeliveryService {

    @Autowired
    PointRepository pointRepository;


    @Override
    public List<PointDto> findAll() {
        return pointRepository.findAll().stream().map(this::mapPointToDto).collect(Collectors.toList());
    }


    private ParamLogDto mapParamLogToDto(ParamLogEntity entity) {
        ParamLogDto dto = new ParamLogDto();
        dto.setId(entity.getId());
        dto.setValue(entity.getValue());
        dto.setDeliveryParamDto(mapDeliveryParamToDto(entity.getDeliveryParamEntity()));

        return dto;
    }


    private DeliveryDto mapDeliveryToDto(DeliveryEntity entity) {
        DeliveryDto dto = new DeliveryDto();
        dto.setId(entity.getId());
        dto.setDeliveryNr(entity.getDeliveryNr());
        dto.setClientName(entity.getClientName());

        return dto;
    }


    private DeliveryParamDto mapDeliveryParamToDto(DeliveryParamEntity entity) {
        DeliveryParamDto dto = new DeliveryParamDto();
        dto.setId(entity.getId());
        dto.setMaxValue(entity.getMaxValue());
        dto.setMinValue(entity.getMinValue());
        dto.setParamName(entity.getParamName());
        dto.setParamUnit(entity.getParamUnit());

        return dto;
    }

    private PointDto mapPointToDto(PointEntity entity) {
        PointDto dto = new PointDto();
        dto.setId(entity.getId());
        dto.setTimestamp(entity.getTimestamp());
        dto.setDeliveryDto(mapDeliveryToDto(entity.getDeliveryEntity()));
        dto.setLatitude(entity.getLatitude());
        dto.setLongitude(entity.getLongitude());
        dto.setParamLogDtos(entity.getParamLogEntities().stream().map(this::mapParamLogToDto).collect(Collectors.toList()));

        return dto;
    }


}
