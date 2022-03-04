package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping("/hi")
	public String hello() {
		
		return "Hello World....1111111";
	}
	
	@GetMapping("/hello")
	public String hello1() {
		
		return "home";
	}
}
