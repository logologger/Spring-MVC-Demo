package com.luv2code.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create the Student Object
		
		Student student = new Student();
		// add it to model
		theModel.addAttribute("countriesOptions",countryOptions);
		theModel.addAttribute(student);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student stundent) {
		
		System.out.println("Studnt First name "+stundent.getFirstName());
		return "student-confirmation";
	}
}
