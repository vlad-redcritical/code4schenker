package org.code4schener.route.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDeliveryParam is a Querydsl query type for DeliveryParam
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDeliveryParam extends EntityPathBase<DeliveryParam> {

    private static final long serialVersionUID = 547515281L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDeliveryParam deliveryParam = new QDeliveryParam("deliveryParam");

    public final QDelivery delivery;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<ParamLog, QParamLog> logParams = this.<ParamLog, QParamLog>createSet("logParams", ParamLog.class, QParamLog.class, PathInits.DIRECT2);

    public final NumberPath<Float> maxValue = createNumber("maxValue", Float.class);

    public final NumberPath<Float> minValue = createNumber("minValue", Float.class);

    public final StringPath paramName = createString("paramName");

    public final StringPath unit = createString("unit");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QDeliveryParam(String variable) {
        this(DeliveryParam.class, forVariable(variable), INITS);
    }

    public QDeliveryParam(Path<? extends DeliveryParam> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDeliveryParam(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDeliveryParam(PathMetadata metadata, PathInits inits) {
        this(DeliveryParam.class, metadata, inits);
    }

    public QDeliveryParam(Class<? extends DeliveryParam> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.delivery = inits.isInitialized("delivery") ? new QDelivery(forProperty("delivery")) : null;
    }

}

