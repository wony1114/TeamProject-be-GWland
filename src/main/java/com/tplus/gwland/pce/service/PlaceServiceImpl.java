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
	
	@Override public long save(Place t) {
		return (repo.save(t) != null)? 1 : 0;
	}
	@Override public long delete(Place t) {
		repo.delete(t);
		return (getOne(t.getPceNum()) == null) ? 1 :0;
	}
	@Override public long count() {
		return (int) repo.count();
	}
	@Override public Place getOne(long id) {
		return repo.getOne(id);
	}
	@Override public Optional<Place> findById(long id) {
		return repo.findById(id);
	}
	@Override public boolean existsById(long id) {
		return repo.existsById(id);
	}
	@Override public List<Place> findAll() {
		return repo.findAll();
	}
	@Override
	public int update(String tel, long pceNum) {
		return 0;
	}
	@Override
	public List<Place> findByContentidAndTitle(String contentid, String title) {
		return repo.findByContentidAndContentid(contentid, title);
	}
}
