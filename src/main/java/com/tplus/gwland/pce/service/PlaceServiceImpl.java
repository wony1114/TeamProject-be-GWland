package com.tplus.gwland.pce.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.tplus.gwland.cmm.domain.Pagination;
import com.tplus.gwland.pce.domain.Place;
import com.tplus.gwland.pce.repository.PlaceRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class PlaceServiceImpl implements PlaceService{
	private final PlaceRepository placeRepository;
	public int add(Place p) {
		return placeRepository.insert(p);
	}

	public int count() {
		return placeRepository.count();
	}

	public List<Place> list(Pagination page) {
		return placeRepository.list().stream()
				//.sorted(Comparator.comparing(Place::getPceNum).reversed())
				.skip(page.getStartRow()-1)
				.limit(page.getPageSize())
				.collect(Collectors.toList());
	}

	public Place detail(String pceNum) {
		return placeRepository.select(pceNum);
	}

	public int delete(Place p) {
		return placeRepository.delete(p);
	}

	public int update(Place p) {
		
		return placeRepository.update(p);
	}


}
