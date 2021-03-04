package com.tplus.gwland.cli.repository;



import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;


import com.tplus.gwland.cli.domain.Client;


@Repository
public class ClientRepositoryImpl extends QuerydslRepositorySupport implements IClientRepository{
	//private final JPAQueryFactory qf;
	private final EntityManager em;
	public ClientRepositoryImpl(EntityManager em) {
		super(Client.class);
		//this.qf = qf;
		this.em = em;
	}

}
