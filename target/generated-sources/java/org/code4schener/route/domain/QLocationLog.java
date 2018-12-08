package org.code4schener.route.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLocationLog is a Querydsl query type for LocationLog
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLocationLog extends EntityPathBase<LocationLog> {

    private static final long serialVersionUID = 1232551911L;

    public static final QLocationLog locationLog = new QLocationLog("locationLog");

    public final StringPath dateTime = createString("dateTime");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath latitude = createString("latitude");

    public final StringPath longitude = createString("longitude");

    public final SetPath<ParamLog, QParamLog> params = this.<ParamLog, QParamLog>createSet("params", ParamLog.class, QParamLog.class, PathInits.DIRECT2);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QLocationLog(String variable) {
        super(LocationLog.class, forVariable(variable));
    }

    public QLocationLog(Path<? extends LocationLog> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLocationLog(PathMetadata metadata) {
        super(LocationLog.class, metadata);
    }

}

