package pl.codeschenker.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "DELIVERY_PARAM")
public class DeliveryParamEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String paramName;

    private String minValue;

    private String maxValue;

    @NotBlank
    private String paramUnit;
}
