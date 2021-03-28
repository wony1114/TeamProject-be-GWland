package com.tplus.gwland.rcm.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecom is a Querydsl query type for Recom
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRecom extends EntityPathBase<Recom> {

    private static final long serialVersionUID = 1146748444L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecom recom = new QRecom("recom");

    public final com.tplus.gwland.crs.domain.QCourse course;

    public final NumberPath<Long> rcmNum = createNumber("rcmNum", Long.class);

    public final com.tplus.gwland.rev.domain.QReview review;

    public final com.tplus.gwland.svy.domain.QSurvey survey;

    public QRecom(String variable) {
        this(Recom.class, forVariable(variable), INITS);
    }

    public QRecom(Path<? extends Recom> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecom(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecom(PathMetadata metadata, PathInits inits) {
        this(Recom.class, metadata, inits);
    }

    public QRecom(Class<? extends Recom> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.course = inits.isInitialized("course") ? new com.tplus.gwland.crs.domain.QCourse(forProperty("course")) : null;
        this.review = inits.isInitialized("review") ? new com.tplus.gwland.rev.domain.QReview(forProperty("review"), inits.get("review")) : null;
        this.survey = inits.isInitialized("survey") ? new com.tplus.gwland.svy.domain.QSurvey(forProperty("survey"), inits.get("survey")) : null;
    }

}

