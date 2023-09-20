package com.dev.stampWar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class AdminController {

	@RequestMapping("/login")
	public String adminLogin() {
		
		return "administration/login";
	}
	
	@RequestMapping("/loginProcess")
	public String loginProcess() {
		
		return "administration/login";
	}
}
