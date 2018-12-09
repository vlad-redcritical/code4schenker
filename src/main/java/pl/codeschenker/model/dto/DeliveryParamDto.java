package pl.codeschenker.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@ToString
public class DeliveryParamDto{


    private Long id;

    private String paramName;

    private String minValue;

    private String maxValue;

    private String paramUnit;

    private String currentValue;
}
