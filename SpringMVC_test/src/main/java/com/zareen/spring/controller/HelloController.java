package com.zareen.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
@RequestMapping("/")
	public String display()
	{
		return "index";
	}	

@RequestMapping("/home")
public String displayhome()
{
	return "home";
}	

@RequestMapping("/welcome")
public String displayWelcome()
{
	return "welcome";
}	
}
