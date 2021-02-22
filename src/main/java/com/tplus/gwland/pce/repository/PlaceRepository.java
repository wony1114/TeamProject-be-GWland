package com.tplus.gwland.pce.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tplus.gwland.pce.domain.Place;
@Repository
public interface PlaceRepository {

	public int insert(Place p);

	public int count();

	public List<Place> list();

	public Place select(String pceNum);

	public int delete(Place p);

	public int update(Place p);

}
