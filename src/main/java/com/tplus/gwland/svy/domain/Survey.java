package com.tplus.gwland.svy.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.tplus.gwland.cli.domain.Client;
import com.tplus.gwland.pce.domain.Place;
import com.tplus.gwland.rcm.domain.Recom;

@Entity
public class Survey {
	@Id @Column(name="svy_num")
	private int svyNum;
	
	@ManyToOne
	@JoinColumn(name="pce_num")
	private Place place;
	@ManyToOne
	@JoinColumn(name="cli_num")
	private Client client;
	
	@OneToMany(mappedBy = "survey")
	private List<Recom> RecomList = new ArrayList<>();
}
