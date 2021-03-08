package com.tplus.gwland.cli.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


import com.tplus.gwland.rev.domain.Review;
import com.tplus.gwland.svy.domain.Survey;

import lombok.Getter;


@Entity @Getter
// @NamedQuery(
//		name="Client.findByCliName",
//		query = "select b from client b where b.cli_name like :cliName")

public class Client{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cli_num")private long cliNum;
	@Column(name="cli_id") private String cliId;
	@Column(name="cli_name") private String cliName;
	@Column(name="cli_gen") private String cliGen;
	@Column(name="cli_mail") private String cliMail;
	@Column(name="cli_age") private String cliAge;

	
	@OneToMany(mappedBy = "client")
    private List<Review> review = new ArrayList<>();
	
	@OneToMany(mappedBy = "client")
    private List<Survey> survey = new ArrayList<>();
}
