package com.tplus.gwland.pce.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tplus.gwland.pce.domain.Place;
import com.tplus.gwland.pce.domain.PlaceDto;

import static com.tplus.gwland.pce.domain.QPlace.place;


@Repository
public class PlaceRepositoryImpl extends QuerydslRepositorySupport implements IPlaceRepository{

	private final JPAQueryFactory qf;
	private final EntityManager em;
	public PlaceRepositoryImpl(JPAQueryFactory qf, EntityManager em) {
		super(Place.class);
		this.qf = qf;
		this.em = em;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Place> findByTitle(String title) {
		return em.createQuery("select p from Place p where p.title like : title").setParameter("title", title).getResultList();
	}
	@Override
	public List<Place> findByContentid(long contentid) {
		return qf.selectFrom(place)
				.where(place.contentid.eq(contentid))
				.fetch();
	}
	@Override
	public List<PlaceDto> findByList() {
		List<Tuple> res = qf.select(place.title,place.firstimage,  place.addr1, place.contentid, place.tel, place.overview).from(place).fetch();
		List<PlaceDto> list = new ArrayList<>();
		for(int i=0;i<res.size();i++) {
			PlaceDto p = new PlaceDto();
			p.setTitle(res.get(i).get(place.title));
			p.setFirstimage(res.get(i).get(place.firstimage));
			p.setAddr1(res.get(i).get(place.addr1));
			p.setContentid(res.get(i).get(place.contentid));
			p.setTel(res.get(i).get(place.tel));
			p.setOverview(res.get(i).get(place.overview));
			list.add(p);
		}
		return list;
	}
	
}