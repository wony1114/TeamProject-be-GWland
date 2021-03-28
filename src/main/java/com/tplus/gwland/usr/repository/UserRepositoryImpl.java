package com.tplus.gwland.usr.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.tplus.gwland.usr.domian.User;

@Repository
public class UserRepositoryImpl extends QuerydslRepositorySupport 
								implements UserCustomRepository {
	
	// private final JPAQueryFactory qf;
	public UserRepositoryImpl() {
		   super(User.class);
		// this.qf = qf;
	}
}
