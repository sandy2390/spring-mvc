package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Student1")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		
		Student theStudent = new Student();
		
		theModel.addAttribute("Student",theStudent);
		
		
		return "student-form";
	}
	
@RequestMapping("/processForm")
public String processForm(@ModelAttribute("Student") Student theStudent) {

	
	return "student-confirmation";
	
	
	
}

	
	
	
}
