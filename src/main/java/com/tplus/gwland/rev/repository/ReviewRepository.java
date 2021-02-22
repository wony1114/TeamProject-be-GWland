package com.tplus.gwland.rev.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tplus.gwland.rev.domain.Review;

public interface ReviewRepository {

	public int insert(Review board);

	public List<Review> select();

	public Review selectById(String bdNum);

	public int update(Review board);

	public int delete(Review board);


}
