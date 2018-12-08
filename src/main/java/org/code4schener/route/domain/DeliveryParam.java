package org.code4schener.route.domain;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.NumberFormat;
import io.springlets.format.EntityFormat;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

/**
 * = DeliveryParam
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(entityFormatExpression = "#{paramName}")
@RooEquals(isJpaEntity = true)
public class DeliveryParam {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "deliveryParamGen", sequenceName = "DELIVERY_PARAM_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "deliveryParamGen")
    private Long id;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Version
    private Integer version;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Size(min = 3, max = 250)
    private String paramName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @NumberFormat
    private Float minValue;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @NumberFormat
    private Float maxValue;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    private String unit;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @EntityFormat
    private Delivery delivery;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "deliveryParam")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<ParamLog> logParams = new HashSet<ParamLog>();
}
