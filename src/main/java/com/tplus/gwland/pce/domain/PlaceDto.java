package com.tplus.gwland.pce.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Lazy
public class PlaceDto {
	private int pceNum;
	private String name;
	private String address;
	private String phoneNumber;
	private String mapX;
	private String mapY;
	private String category;
	private String city;
	private String placeImg;
}
