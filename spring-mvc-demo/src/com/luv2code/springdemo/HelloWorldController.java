package com.luv2code.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	
	@RequestMapping("/showForm")
	public String showForm() {
	
	return "helloworld-form";
	
	}
	
	@RequestMapping("/processform")
	public String processform() {
		
		return "helloworld";
	}
	
	@RequestMapping("/processformversion2")
	public String letsShoutoutDude(HttpServletRequest request,Model model) {
		
		String theName=request.getParameter("studentName");
		
		theName= theName.toUpperCase();
		
	    String result = "Yo! "+ theName;	
	    model.addAttribute("message",result);
	
	return "helloworld";
	}
	
	
	@RequestMapping("/processformversion3")
	public String processformvarsion3(@RequestParam("studentName")String theName, Model model) {
		
		
		theName= theName.toUpperCase();
		
	    String result = "Hey, Good Morning! "+ theName;	
	    model.addAttribute("message",result);
	
	return "helloworld";
	}
	
	
	
        }




