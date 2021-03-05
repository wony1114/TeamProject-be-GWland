package com.tplus.gwland.pce.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tplus.gwland.pce.domain.Place;


@Repository
public class PlaceRepositoryImpl extends QuerydslRepositorySupport implements IPlaceRepository{

	//private final JPAQueryFactory qf;
	private final EntityManager em;
	public PlaceRepositoryImpl(EntityManager em) {
		super(Place.class);
		//this.qf = qf;
		this.em = em;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Place> findByTitle(String title) {
		return em.createQuery("select p from Place p where p.title like : title").setParameter("title", title).getResultList();
	}
	
}
