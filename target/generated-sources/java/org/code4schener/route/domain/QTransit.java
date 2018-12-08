package org.code4schener.route.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTransit is a Querydsl query type for Transit
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTransit extends EntityPathBase<Transit> {

    private static final long serialVersionUID = 289394283L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTransit transit = new QTransit("transit");

    public final QDelivery delivery;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath latitude = createString("latitude");

    public final StringPath longitude = createString("longitude");

    public final StringPath point = createString("point");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QTransit(String variable) {
        this(Transit.class, forVariable(variable), INITS);
    }

    public QTransit(Path<? extends Transit> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTransit(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTransit(PathMetadata metadata, PathInits inits) {
        this(Transit.class, metadata, inits);
    }

    public QTransit(Class<? extends Transit> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.delivery = inits.isInitialized("delivery") ? new QDelivery(forProperty("delivery")) : null;
    }

}

