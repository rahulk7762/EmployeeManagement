package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String greeting() {
		System.out.println("Welcome.greeting()");
		return "home";
	}
	
	@RequestMapping(value = "/addEmp",method = RequestMethod.GET)
	public String AddEmp() {
		System.out.println("HomeController.AddEmp()");
		return "addEmp";
	}
	
	
	@RequestMapping(path = "/createEmp", method = RequestMethod.POST)
	public String CreateEmp() {
		return "addEmp";
	}
	
	
}
  

