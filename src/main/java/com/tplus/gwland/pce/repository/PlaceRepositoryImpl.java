package com.tplus.gwland.pce.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tplus.gwland.pce.domain.Place;


@Repository
public class PlaceRepositoryImpl extends QuerydslRepositorySupport implements IPlaceRepository{

	//private final JPAQueryFactory qf;
	public PlaceRepositoryImpl() {
		super(Place.class);
		//this.qf = qf;
	}
	
}
