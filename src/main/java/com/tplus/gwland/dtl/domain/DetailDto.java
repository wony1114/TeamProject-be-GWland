package com.tplus.gwland.dtl.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@Lazy
public class DetailDto {
	private long dtlNum;
	private String contentid;
	private String overview;
}
