package com.tplus.gwland.cat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tplus.gwland.cat.domain.Category;
interface ICategoryRepository {
	public List<Category> findByContentid(String contentid);
}
public interface CategoryRepository extends JpaRepository<Category, Long>, ICategoryRepository{
	
}
