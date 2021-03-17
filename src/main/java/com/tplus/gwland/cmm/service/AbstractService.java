package com.tplus.gwland.cmm.service;

import java.util.List;
import java.util.Optional;

import com.tplus.gwland.pce.domain.Place;

public abstract class AbstractService<T> {
	public abstract long save(T t);
	public abstract long saveAll(List<T> t);
	public abstract long delete(T t);
	public abstract long count();
	public abstract T getOne(long id);
	public abstract Optional<T> findById(long id);
	public abstract boolean existsById(long id);
	public abstract List<T> findAll();	
}

