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

import com.tplus.gwland.cli.domain.Client;
import com.tplus.gwland.pce.domain.Place;
import com.tplus.gwland.rcm.domain.Recom;

@Entity 

public class Review {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id @Column(name="rev_num")private long revNum;
	
	@OneToMany(mappedBy= "review")
	private List<Recom> recom = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="cli_num")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="pce_num")
	private Place place;	
}