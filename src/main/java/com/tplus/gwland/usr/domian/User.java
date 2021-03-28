package com.tplus.gwland.usr.domian;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

import com.tplus.gwland.rev.domain.Review;
import com.tplus.gwland.svy.domain.Survey;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder @Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long num;
	private String role; 
	private String provider;
	private String providerId;
	private String username;
	private String email;
	private String age;
	private String gender;
	private String password;
	
	@CreationTimestamp
	private Timestamp createDate;
	
	@OneToMany(mappedBy = "user")
    private List<Review> review = new ArrayList<>();
	
	@OneToMany(mappedBy = "user")
    private List<Survey> survey = new ArrayList<>();

}