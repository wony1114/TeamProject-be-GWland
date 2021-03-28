package com.tplus.gwland.svy.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.tplus.gwland.pce.domain.Place;
import com.tplus.gwland.rcm.domain.Recom;
import com.tplus.gwland.usr.domian.User;

@Entity
public class Survey {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id @Column(name="svy_num")
	private long svyNum;
	
	@ManyToOne
	@JoinColumn(name="contentid")
	private Place place;
	@ManyToOne
	@JoinColumn(name="num")
	private User user;
	
	@OneToMany(mappedBy = "survey")
	private List<Recom> RecomList = new ArrayList<>();
}
