package pl.codeschenker.model.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class ParamLogDto {
    private Long id;
    private DeliveryParamDto deliveryParamDto;
}
