package com.tplus.gwland.sec.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
public class CorsController {
	@GetMapping("/")
	public String redirect(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws IOException {
		String redirectUrl = "redirect:http://localhost:3000";
		return redirectUrl;
	}

	@GetMapping("/index")
		public Map<?, ?> redirect1(HttpServletRequest httpServletRequest, 
							HttpServletResponse httpServletResponse) 
				throws IOException{
		Map<String, Object> map = new HashMap<>();
		
		return null;
	}
}
			
