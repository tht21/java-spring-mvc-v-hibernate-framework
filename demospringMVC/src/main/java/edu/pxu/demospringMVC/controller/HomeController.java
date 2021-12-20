package edu.pxu.demospringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pxu.demospringMVC.model.User;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	  @RequestMapping("/hello") 
	  public String hello(Model model) { 
		  User user = new User(); 
		  user.setFullName("Nguyen Van Quoc Viet"); 
		  model.addAttribute("myuser", user); 
		  return "hello";  
	  }
	 
}
