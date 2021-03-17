package com.tplus.gwland.dtl.service;

import java.util.List;

import com.tplus.gwland.dtl.domain.Detail;

public interface DetailService {
	public List<Detail> findByContentid(String contentid);
}
