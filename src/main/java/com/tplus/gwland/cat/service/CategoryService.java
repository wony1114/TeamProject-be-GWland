package com.tplus.gwland.cat.service;

import java.util.List;

import com.tplus.gwland.cat.domain.Category;

public interface CategoryService {
	public List<Category> findByContentid(String contentid);
}
