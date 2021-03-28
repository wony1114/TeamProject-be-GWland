package com.tplus.gwland.rev.domain;

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

public class Review {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id @Column(name="rev_num")private long revNum;
	
	@OneToMany(mappedBy= "review")
	private List<Recom> recom = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="cli_num")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="contentid")
	private Place place;	
}