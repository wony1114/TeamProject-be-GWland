package com.tplus.gwland.dtl.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tplus.gwland.dtl.domain.Detail;

@Repository
public class DetailRepositoryImpl extends QuerydslRepositorySupport implements IDetailRepository{

	//private final JPAQueryFactory qf;
	private EntityManager em;
	public DetailRepositoryImpl(EntityManager em) {
		super(Detail.class);
		//this.qf = qf;
		this.em = em;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Detail> findByContentid(String contentid) {
		// TODO Auto-generated method stub
		return em.createNamedQuery("Detail.findByContentid").setParameter("contentid", contentid).getResultList();
	}

}
