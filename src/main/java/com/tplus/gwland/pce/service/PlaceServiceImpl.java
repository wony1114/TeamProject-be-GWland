package com.tplus.gwland.pce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tplus.gwland.cmm.service.AbstractService;
import com.tplus.gwland.pce.domain.Place;
import com.tplus.gwland.pce.repository.PlaceRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class PlaceServiceImpl extends AbstractService<Place> implements PlaceService{
	private final PlaceRepository repo;
	
	@Override public int save(Place t) {
		return (repo.save(t) != null)? 1 : 0;
	}
	@Override public int delete(Place t) {
		repo.delete(t);
		return (getOne(t.getPceNum()) == null) ? 1 :0;
	}
	@Override public int count() {
		return (int) repo.count();
	}
	@Override public Place getOne(int id) {
		return repo.getOne(id);
	}
	@Override public Optional<Place> findById(int id) {
		return repo.findById(id);
	}
	@Override public boolean existsById(int id) {
		return repo.existsById(id);
	}
	@Override public List<Place> findAll() {
		return repo.findAll();
	}
}
