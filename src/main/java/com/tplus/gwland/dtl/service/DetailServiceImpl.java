package com.tplus.gwland.dtl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tplus.gwland.cmm.service.AbstractService;
import com.tplus.gwland.dtl.domain.Detail;
import com.tplus.gwland.dtl.repository.DetailRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DetailServiceImpl extends AbstractService<Detail> implements DetailService{
	private final DetailRepository repo;
	
	@Override public long save(Detail t) {
		return (repo.save(t) != null) ? 1 : 0;
	}

	@Override public long delete(Detail t) {
		repo.delete(t);
		return (getOne(t.getDtlNum()) == null) ? 1 : 0;
	}

	@Override public long count() {
		return (int) repo.count();
	}

	@Override public Detail getOne(long id) {
		return repo.getOne(id);
	}

	@Override public Optional<Detail> findById(long id) {
		return repo.findById(id);
	}

	@Override public boolean existsById(long id) {
		return repo.existsById(id);
	}

	@Override public List<Detail> findAll() {
		return repo.findAll();
	}

	@Override
	public List<Detail> findByContentid(String contentid) {
		return repo.findByContentid(contentid);
	}

	@Override
	public long saveAll(List<Detail> t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
