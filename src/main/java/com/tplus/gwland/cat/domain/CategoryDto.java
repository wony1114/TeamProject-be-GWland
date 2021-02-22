package com.tplus.gwland.cat.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@Lazy
public class CategoryDto {
	private int catNum;
	private String area;
	private String tourType;
}
