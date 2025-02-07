package pl.codeschenker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.codeschenker.model.DeliveryEntity;
import pl.codeschenker.model.DeliveryParamEntity;
import pl.codeschenker.model.PointEntity;
import pl.codeschenker.model.dto.*;
import pl.codeschenker.model.ParamLogEntity;
import pl.codeschenker.repository.ParamsRepository;
import pl.codeschenker.repository.PointsRepository;
import pl.codeschenker.service.DeliveryService;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class DeliveryServiceImpl implements DeliveryService {

    @Autowired
    PointsRepository pointsRepository;

    @Autowired
    ParamsRepository paramsRepository;


    @Override
    public PointDto findOne(Long id) {
        return mapPointToDto(pointsRepository.findOne(id));
    }

    @Override
    public List<SettingsDto> findByCriteria(Long id) {
        return paramsRepository.getAllByDeliveryParamEntity_Id(id).stream().map(this::converToSettingsDto).collect(Collectors.toList());
    }

    private SettingsDto converToSettingsDto(ParamLogEntity entity) {
        SettingsDto dto = new SettingsDto();
        dto.setField("");
        dto.setMinValue(entity.getDeliveryParamEntity().getMinValue());
        dto.setMaxValue(entity.getDeliveryParamEntity().getMaxValue());
        dto.setValue(entity.getValue());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm dd-MM-yyyy");
        dto.setTimestamp(simpleDateFormat.format(entity.getPointEntity().getTimestamp()));
        return dto;
    }


    private ParamLogDto mapParamLogToDto(ParamLogEntity entity) {
        ParamLogDto dto = new ParamLogDto();
        dto.setId(entity.getId());
        dto.setDeliveryParamDto(mapDeliveryParamToDto(entity.getDeliveryParamEntity(), entity.getValue()));
        return dto;
    }


    private DeliveryDto mapDeliveryToDto(DeliveryEntity entity) {
        DeliveryDto dto = new DeliveryDto();
        dto.setId(entity.getId());
        dto.setDeliveryNr(entity.getDeliveryNr());
        dto.setClientName(entity.getClientName());
        return dto;
    }


    private DeliveryParamDto mapDeliveryParamToDto(DeliveryParamEntity entity, String currentValue) {
        DeliveryParamDto dto = new DeliveryParamDto();
        dto.setId(entity.getId());
        dto.setMaxValue(entity.getMaxValue());
        dto.setMinValue(entity.getMinValue());
        dto.setParamName(entity.getParamName());
        dto.setParamUnit(entity.getParamUnit());
        dto.setCurrentValue(currentValue);

        return dto;
    }

    private PointDto mapPointToDto(PointEntity entity) {
        PointDto dto = new PointDto();
        dto.setId(entity.getId());
        dto.setTimestamp(entity.getTimestamp());
        dto.setDeliveryDto(mapDeliveryToDto(entity.getDeliveryEntity()));

        PositionDto positionDto = new PositionDto();
        positionDto.setLat(Float.parseFloat(entity.getLatitude()));
        positionDto.setLng(Float.parseFloat(entity.getLongitude()));

        dto.setPosition(positionDto);
        dto.setParamLogDtos(entity.getParamLogEntities().stream().map(this::mapParamLogToDto).collect(Collectors.toList()));
        return dto;
    }

}
