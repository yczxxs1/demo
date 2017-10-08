package com.javatpoint.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.javatpoint.model.User;

@RestController
public class RestfullController {
	
	@RequestMapping(path = "user/{userId}")
	public String welcome(@PathVariable String userId) {
		return "Hello World";
	}
	
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public ModelAndView login(User user) {
		String message = "HELLO SPRING MVC HOW R U";

		return new ModelAndView("helloPage", "message", message);
	}
	
	
	@DeleteMapping(path = "user/{userId}")
	public String hello(@PathVariable String userId) {
		return "Hello World";
	}
	
	
	
}
