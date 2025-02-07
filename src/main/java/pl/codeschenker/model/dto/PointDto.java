package pl.codeschenker.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
public class PointDto{

    private Long id;

    private Date timestamp;

    private PositionDto position;

    private DeliveryDto deliveryDto;

    private List<ParamLogDto> paramLogDtos;
}
