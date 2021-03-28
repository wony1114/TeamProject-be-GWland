package com.tplus.gwland.dtl.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDetail is a Querydsl query type for Detail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDetail extends EntityPathBase<Detail> {

    private static final long serialVersionUID = 1720950755L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDetail detail = new QDetail("detail");

    public final NumberPath<Long> dtlNum = createNumber("dtlNum", Long.class);

    public final StringPath overview = createString("overview");

    public final com.tplus.gwland.pce.domain.QPlace place;

    public QDetail(String variable) {
        this(Detail.class, forVariable(variable), INITS);
    }

    public QDetail(Path<? extends Detail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDetail(PathMetadata metadata, PathInits inits) {
        this(Detail.class, metadata, inits);
    }

    public QDetail(Class<? extends Detail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.place = inits.isInitialized("place") ? new com.tplus.gwland.pce.domain.QPlace(forProperty("place")) : null;
    }

}

