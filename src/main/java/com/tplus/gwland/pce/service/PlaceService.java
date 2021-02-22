package com.tplus.gwland.pce.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.tplus.gwland.cmm.domain.Pagination;
import com.tplus.gwland.pce.domain.Place;

public interface PlaceService{

	public int add(Place p);

	public int count();

	public List<Place> list(Pagination page);

	public Place detail(String pceNum);

	public int delete(Place p);

	public int update(Place p);

}
