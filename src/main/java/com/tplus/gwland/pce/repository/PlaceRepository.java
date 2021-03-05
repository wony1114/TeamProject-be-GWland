package com.tplus.gwland.pce.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tplus.gwland.pce.domain.Place;
interface IPlaceRepository {
	public List<Place> findByTitle(String title);
}
public interface PlaceRepository extends JpaRepository<Place, Integer>, IPlaceRepository {
	@Query(value="update place p set p.tel = :tel "
			+ " where p.pce_num = :pceNum", nativeQuery = true)
	public int update(@Param("tel") String tel, @Param("pceNum") int pceNum);
	public List<Place> findByContentidAndContentid(String contentid, String title);
}
