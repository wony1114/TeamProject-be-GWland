package com.tplus.gwland.crs.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCourse is a Querydsl query type for Course
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCourse extends EntityPathBase<Course> {

    private static final long serialVersionUID = -962677323L;

    public static final QCourse course = new QCourse("course");

    public final StringPath crsName = createString("crsName");

    public final NumberPath<Long> crsNum = createNumber("crsNum", Long.class);

    public final ListPath<com.tplus.gwland.rcm.domain.Recom, com.tplus.gwland.rcm.domain.QRecom> RecomList = this.<com.tplus.gwland.rcm.domain.Recom, com.tplus.gwland.rcm.domain.QRecom>createList("RecomList", com.tplus.gwland.rcm.domain.Recom.class, com.tplus.gwland.rcm.domain.QRecom.class, PathInits.DIRECT2);

    public QCourse(String variable) {
        super(Course.class, forVariable(variable));
    }

    public QCourse(Path<? extends Course> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCourse(PathMetadata metadata) {
        super(Course.class, metadata);
    }

}

