package com.tplus.gwland.cat.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.tplus.gwland.pce.domain.Place;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cat_num") private int catNum;
	@Column(name="area") private String area;
	@Column(name="tour_type") private String tourType;
	
	@OneToMany(mappedBy="category")
	private List<Place> placeList = new ArrayList<>();
}
