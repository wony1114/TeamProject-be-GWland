package com.tplus.gwland.cli.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tplus.gwland.cli.domain.Client;

interface IClientRepository{
}
public interface ClientRepository extends JpaRepository<Client, Integer>, IClientRepository {
	
}
