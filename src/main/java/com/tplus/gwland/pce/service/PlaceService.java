package com.tplus.gwland.pce.service;

import java.util.List;

import com.tplus.gwland.pce.domain.Place;

public interface PlaceService{
	public List<Place> findByContentidAndTitle(String contentid, String title);
	public List<Place> findByContenttypeid(String contenttypeid);
	int update(String tel, long pceNum);
}
