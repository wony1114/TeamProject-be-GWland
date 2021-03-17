package com.tplus.gwland.cli.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tplus.gwland.cli.domain.Client;
import com.tplus.gwland.cli.repository.ClientRepository;
import com.tplus.gwland.cmm.service.AbstractService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl extends AbstractService<Client> implements ClientService {
	private final ClientRepository repo;

	@Override
	public long save(Client t) {
		return (repo.save(t) != null) ? 1 : 0;
	}

	@Override
	public long delete(Client t) {
		repo.delete(t);
		return (getOne(t.getCliNum()) == null) ? 1 : 0;
	}

	@Override
	public long count() {
		return (int) repo.count();
	}

	@Override
	public Client getOne(long id) {
		return repo.getOne(id);
	}

	@Override
	public Optional<Client> findById(long id) {
		return repo.findById(id);
	}

	@Override
	public boolean existsById(long id) {
		return repo.existsById(id);
	}

	@Override
	public List<Client> findAll() {
		return repo.findAll();
	}

	@Override
	public List<Client> findByCliAge(String cliAge) {
		return null;
	}

	@Override
	public long saveAll(List<Client> t) {
		// TODO Auto-generated method stub
		return 0;
	}




}
