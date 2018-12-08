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
import io.springlets.format.EntityFormat;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

/**
 * = Transit
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(entityFormatExpression = "#{longitude}, #{latitude}")
@RooEquals(isJpaEntity = true)
public class Transit {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "transitGen", sequenceName = "TRANSIT_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "transitGen")
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
    @Size(max = 100)
    private String longitude;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Size(max = 100)
    private String latitude;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Size(max = 100)
    private String point;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @EntityFormat
    private Delivery delivery;
}
