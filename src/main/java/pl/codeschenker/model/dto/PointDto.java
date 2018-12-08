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

    private String latitude;

    private String longitude;

    private DeliveryDto deliveryDto;

    private List<ParamLogDto> paramLogDtos;
}
