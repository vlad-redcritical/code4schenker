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
import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

/**
 * = LocationLog
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(entityFormatExpression = "#{longitude}, #{latitude}")
@RooEquals(isJpaEntity = true)
public class LocationLog {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "locationLogGen", sequenceName = "LOCATION_LOG_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "locationLogGen")
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
    private String dateTime;

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
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "location")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<ParamLog> params = new HashSet<ParamLog>();
}
