package com.tplus.gwland.crs.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.tplus.gwland.rcm.domain.Recom;

@Entity
public class Course {
	@Id @Column(name="crs_num") @GeneratedValue(strategy = GenerationType.AUTO)
	private int crsNum;
	@Column private String crsName;
	
	@OneToMany(mappedBy = "course")
	private List<Recom> RecomList = new ArrayList<>();
}