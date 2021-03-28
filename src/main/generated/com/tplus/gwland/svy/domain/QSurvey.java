package com.tplus.gwland.svy.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSurvey is a Querydsl query type for Survey
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSurvey extends EntityPathBase<Survey> {

    private static final long serialVersionUID = -1907797498L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSurvey survey = new QSurvey("survey");

    public final com.tplus.gwland.pce.domain.QPlace place;

    public final ListPath<com.tplus.gwland.rcm.domain.Recom, com.tplus.gwland.rcm.domain.QRecom> RecomList = this.<com.tplus.gwland.rcm.domain.Recom, com.tplus.gwland.rcm.domain.QRecom>createList("RecomList", com.tplus.gwland.rcm.domain.Recom.class, com.tplus.gwland.rcm.domain.QRecom.class, PathInits.DIRECT2);

    public final NumberPath<Long> svyNum = createNumber("svyNum", Long.class);

    public final com.tplus.gwland.usr.domian.QUser user;

    public QSurvey(String variable) {
        this(Survey.class, forVariable(variable), INITS);
    }

    public QSurvey(Path<? extends Survey> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSurvey(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSurvey(PathMetadata metadata, PathInits inits) {
        this(Survey.class, metadata, inits);
    }

    public QSurvey(Class<? extends Survey> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.place = inits.isInitialized("place") ? new com.tplus.gwland.pce.domain.QPlace(forProperty("place")) : null;
        this.user = inits.isInitialized("user") ? new com.tplus.gwland.usr.domian.QUser(forProperty("user")) : null;
    }

}

