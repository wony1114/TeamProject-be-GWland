package com.tplus.gwland.cat.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tplus.gwland.cat.domain.Category;

@Repository
public class CategoryRepositoryImpl extends QuerydslRepositorySupport implements ICategoryRepository{

	//private final JPAQueryFactory qf;
	private EntityManager em;
	public CategoryRepositoryImpl(EntityManager em) {
		super(Category.class);
		//this.qf = qf;
		this.em = em;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Category> findByContentid(String contentid) {
		// TODO Auto-generated method stub
		return em.createNamedQuery("Category.findByContentid").setParameter("contentid", contentid).getResultList();
	}

}
