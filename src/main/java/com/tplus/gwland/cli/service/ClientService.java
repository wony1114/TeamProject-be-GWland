package com.tplus.gwland.cli.service;

import java.util.List;

import com.tplus.gwland.cli.domain.Client;

public interface ClientService {

	public List<Client> findByCliAge(String cliAge);
	

}