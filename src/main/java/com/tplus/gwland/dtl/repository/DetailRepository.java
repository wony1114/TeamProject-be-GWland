package com.tplus.gwland.dtl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tplus.gwland.dtl.domain.Detail;
interface IDetailRepository {
	public List<Detail> findByContentid(String contentid);
}
public interface DetailRepository extends JpaRepository<Detail, Long>, IDetailRepository{
	
}
