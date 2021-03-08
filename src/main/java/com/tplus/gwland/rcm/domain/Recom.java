package com.tplus.gwland.rcm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.tplus.gwland.crs.domain.Course;
import com.tplus.gwland.rev.domain.Review;
import com.tplus.gwland.svy.domain.Survey;

@Entity
public class Recom {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id @Column(name="rcm_num")
	private long rcmNum;
	
	@ManyToOne
	@JoinColumn(name="crs_num")
	private Course course;
	@ManyToOne
	@JoinColumn(name="svy_num")
	private Survey survey;
	@ManyToOne
	@JoinColumn(name="rev_num")
	private Review review;
}