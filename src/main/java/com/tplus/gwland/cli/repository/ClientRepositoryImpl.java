package com.tplus.gwland.cli.repository;

import java.util.List;

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

	@SuppressWarnings("unchecked")
	@Override
	public List<Client> findByCliName(String cliName) {
		return em.createQuery("select b from client b where b.cli_name like :cliName")
				.setParameter("cliName", cliName)
				.getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Client> findByfindByCliAge(String cliAge) {
		return em.createQuery("select b from client b where b.cli_age like :cliAge")
				.setParameter("cliAge", cliAge)
				.getResultList();
	}
}
