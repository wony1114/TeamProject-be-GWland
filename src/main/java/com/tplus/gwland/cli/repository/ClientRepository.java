package com.tplus.gwland.cli.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tplus.gwland.cli.domain.Client;

interface IClientRepository{
	public List<Client> findByCliName(String cliName);
	public List<Client> findByfindByCliAge(String cliAge);
	
}
public interface ClientRepository extends JpaRepository<Client, Long>, IClientRepository{
	
}
