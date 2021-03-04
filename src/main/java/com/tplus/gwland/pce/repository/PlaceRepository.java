package com.tplus.gwland.pce.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tplus.gwland.pce.domain.Place;
interface IPlaceRepository {

}
public interface PlaceRepository extends JpaRepository<Place, Integer>, IPlaceRepository {
	@Query("update Place set tel = :#{#place.tel} where pce_num = :#{#pceNum}")
	public int update(@Param("place") Place t);
	public List<Place> findByTitleAndContentid(String title, String contentid);
}
