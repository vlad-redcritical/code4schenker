package pl.codeschenker.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "PARAM_LOG")
public class ParamLogEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private DeliveryParamEntity deliveryParamEntity;

    @NotBlank
    private String value;

    @ManyToOne
    private PointEntity pointEntity;
}
