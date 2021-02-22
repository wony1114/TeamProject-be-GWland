package com.tplus.gwland.pce.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.tplus.gwland.cat.domain.Category;
import com.tplus.gwland.rev.domain.Review;


@Entity
public class Place {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pce_num") private int pceNum;
	@Column(name="pce_name") private String pceName;
	@Column(name="address") private String address;
	@Column(name="phone_number") private String phoneNumber;
	@Column(name="mapX") private String mapX;
	@Column(name="mapY") private String mapY;
	@Column(name="place_img") private String placeImg;
	
	@ManyToOne
	@JoinColumn(name="cat_num")
	private Category category;
	
	@OneToMany(mappedBy = "place")
	private List<Review> reviewList = new ArrayList<>();
}
