package pl.codeschenker.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "LOCATION_LOG")
public class PointEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @NotBlank
    private String latitude;

    @NotBlank
    private String longitude;

    @ManyToOne
    private DeliveryEntity deliveryEntity;

    @OneToMany(mappedBy = "pointEntity")
    private List<ParamLogEntity> paramLogEntities;
}
