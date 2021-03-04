package com.tplus.gwland.pce.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.tplus.gwland.cat.domain.Category;
import com.tplus.gwland.rev.domain.Review;

import lombok.Getter;

@Entity @Getter
public class Place {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pce_num") private int pceNum;
	@Column(name="addr1") private String addr1;
	@Column(name="addr2") private String addr2;
	@Column(name="areacode") private String areacode;
	@Column(name="cat1") private String cat1;
	@Column(name="cat2") private String cat2;
	@Column(name="cat3") private String cat3;
	@Column(name="contentid") private String contentid;
	@Column(name="contenttypeid") private String contenttypeid;
	@Column(name="createdtime") private String createdtime;
	@Column(name="firstimage") private String firstimage;
	@Column(name="firstimage2") private String firstimage2;
	@Column(name="mapx") private String mapx;
	@Column(name="mapy") private String mapy;
	@Column(name="mlevel") private String mlevel;
	@Column(name="modifiedtime") private String modifiedtime;
	@Column(name="readcount") private String readcount;
	@Column(name="sigungucode") private String sigungucode;
	@Column(name="tel") private String tel;
	@Column(name="title") private String title;
	@Column(name="zipcode") private String zipcode;
	
	@ManyToOne
	@JoinColumn(name="cat_num")
	private Category category;
	
	@OneToMany(mappedBy = "place")
	private List<Review> reviewList = new ArrayList<>();
}
