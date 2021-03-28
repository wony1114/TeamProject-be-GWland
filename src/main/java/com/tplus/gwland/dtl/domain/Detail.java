package com.tplus.gwland.dtl.domain;

import javax.persistence.*;

import com.tplus.gwland.pce.domain.Place;

import lombok.Data;
import lombok.Getter;

@Entity @Getter @Data
//@NamedQuery(name = "Detail.findByContentid", query = "select c from Detail c where c.contentid like :contentid")
public class Detail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="dtl_num") private long dtlNum;
	@Column(name="overview") private String overview;
	
	@OneToOne
	@JoinColumn(name="contentid")
	private Place place;
}
