package com.security.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {
		
	@GetMapping("/login")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView("loginuser");
	    return modelAndView;
	}
	@GetMapping("/hello")
	public String helloString() {
	    return "You're logged";
	}
	
}
