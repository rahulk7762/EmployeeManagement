package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String greeting() {
		System.out.println("Welcome.greeting()");
		return "home";
	}
	
//	@RequestMapping(value = "/login",method = RequestMethod.GET)
//	public String greeting1() {
//		System.out.println("HomeController.greeting1()");
//		return "home";
//	}
	
}


