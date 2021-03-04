package com.tplus.gwland.cli.domain;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@Lazy
public class ClientDto {
	private String cliId;
	private String name;
	private String gender;
	private String phoneNum;
	private String regDate;
	
}
