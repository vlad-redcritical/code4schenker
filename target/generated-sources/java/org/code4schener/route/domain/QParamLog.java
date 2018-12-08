package org.code4schener.route.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QParamLog is a Querydsl query type for ParamLog
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QParamLog extends EntityPathBase<ParamLog> {

    private static final long serialVersionUID = 271803871L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QParamLog paramLog = new QParamLog("paramLog");

    public final QDelivery delivery;

    public final QDeliveryParam deliveryParam;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QLocationLog location;

    public final StringPath paramName = createString("paramName");

    public final NumberPath<Float> paramValue = createNumber("paramValue", Float.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QParamLog(String variable) {
        this(ParamLog.class, forVariable(variable), INITS);
    }

    public QParamLog(Path<? extends ParamLog> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QParamLog(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QParamLog(PathMetadata metadata, PathInits inits) {
        this(ParamLog.class, metadata, inits);
    }

    public QParamLog(Class<? extends ParamLog> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.delivery = inits.isInitialized("delivery") ? new QDelivery(forProperty("delivery")) : null;
        this.deliveryParam = inits.isInitialized("deliveryParam") ? new QDeliveryParam(forProperty("deliveryParam"), inits.get("deliveryParam")) : null;
        this.location = inits.isInitialized("location") ? new QLocationLog(forProperty("location")) : null;
    }

}

