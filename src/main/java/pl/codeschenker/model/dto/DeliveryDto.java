package pl.codeschenker.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@ToString
public class DeliveryDto {


    private Long id;
    private String deliveryNr;
    private String clientName;
}
