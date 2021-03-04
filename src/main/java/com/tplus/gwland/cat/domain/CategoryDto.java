package com.tplus.gwland.cat.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@Lazy
public class CategoryDto {
	private int catNum;
	private String areacode;
	private String cat1;
	private String cat2;
	private String cat3;
	private String contentid;
	private String contenttypeid;
}
