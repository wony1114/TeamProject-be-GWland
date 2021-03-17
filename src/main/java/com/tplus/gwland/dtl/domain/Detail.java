package com.tplus.gwland.dtl.domain;

import javax.persistence.*;

import com.tplus.gwland.pce.domain.Place;

import lombok.Getter;

@Entity @Getter 
@NamedQuery(name = "Detail.findByContentid", query = "select c from Detail c where c.contentid like :contentid")
public class Detail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="dtl_num") private long dtlNum;
	@Column(name="contentid") private String contentid;
	@Column(name="overview") private String overview;
	
	@ManyToOne
	@JoinColumn(name="pce_num")
	private Place place;
}
