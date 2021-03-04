package com.tplus.gwland.cli.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import com.tplus.gwland.rev.domain.Review;
import com.tplus.gwland.svy.domain.Survey;

import lombok.Getter;


@Entity @Getter

public class Client{
	@Id @Column(name="cli_num")private int cliNum;
	@Column(name="cli_id") private String cliId;
	@Column(name="name") private String name;
	@Column(name="gender") private String gender;
	@Column(name="phone_num") private String phoneNum;
	@Column(name="reg_date") private String regDate;
	
	@OneToMany(mappedBy = "client")
    private List<Review> review = new ArrayList<>();
	
	@OneToMany(mappedBy = "client")
    private List<Survey> survey = new ArrayList<>();
}