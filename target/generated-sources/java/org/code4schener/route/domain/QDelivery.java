package org.code4schener.route.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDelivery is a Querydsl query type for Delivery
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDelivery extends EntityPathBase<Delivery> {

    private static final long serialVersionUID = -76130724L;

    public static final QDelivery delivery = new QDelivery("delivery");

    public final StringPath clientName = createString("clientName");

    public final StringPath deliveryNr = createString("deliveryNr");

    public final SetPath<DeliveryParam, QDeliveryParam> deliveryParams = this.<DeliveryParam, QDeliveryParam>createSet("deliveryParams", DeliveryParam.class, QDeliveryParam.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<ParamLog, QParamLog> params = this.<ParamLog, QParamLog>createSet("params", ParamLog.class, QParamLog.class, PathInits.DIRECT2);

    public final SetPath<Transit, QTransit> transits = this.<Transit, QTransit>createSet("transits", Transit.class, QTransit.class, PathInits.DIRECT2);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QDelivery(String variable) {
        super(Delivery.class, forVariable(variable));
    }

    public QDelivery(Path<? extends Delivery> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDelivery(PathMetadata metadata) {
        super(Delivery.class, metadata);
    }

}

