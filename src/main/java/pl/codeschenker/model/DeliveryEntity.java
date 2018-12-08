package pl.codeschenker.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name = "DELIVERY")
public class DeliveryEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String deliveryNr;

    @NotBlank
    private String clientName;
}
