package com.test.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/index")
	public String test() {
		return "index";
	}
	
	@RequestMapping("/aabb")
	public String aaa() {
		return "Hi";
	}
}
