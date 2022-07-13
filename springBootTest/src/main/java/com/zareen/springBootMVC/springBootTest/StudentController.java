package com.zareen.springBootMVC.springBootTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	@RequestMapping("/")  
	public String index()
	{  
	//returns to index.html
	return"index";  
	} 
	
	@RequestMapping(value="/showData", method=RequestMethod.POST)  
	public ModelAndView save(@ModelAttribute Student student) {
		ModelAndView modelAndView = new ModelAndView();  
		modelAndView.setViewName("showData");      
		modelAndView.addObject("student", student);    
		return modelAndView;
	}
}
