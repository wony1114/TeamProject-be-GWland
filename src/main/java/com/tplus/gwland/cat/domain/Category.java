package com.tplus.gwland.cat.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.tplus.gwland.pce.domain.Place;

import lombok.Getter;

@Entity @Getter 
@NamedQuery(name = "Category.findByContentid", query = "select c from Category c where c.contentid like :contentid")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cat_num") private int catNum;
	@Column(name="areacode") private String areacode;
	@Column(name="cat1") private String cat1;
	@Column(name="cat2") private String cat2;
	@Column(name="cat3") private String cat3;
	@Column(name="contentid") private String contentid;
	@Column(name="contenttypeid") private String contenttypeid;
	
	@OneToMany(mappedBy="category")
	private List<Place> placeList = new ArrayList<>();
}
