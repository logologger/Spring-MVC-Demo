package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	// need a controller method to show initial form 
	
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	// need a controller method to process the form 
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	//new controller method to read form data 
	// add data to the model which in turn willl be red by JSP
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read the request studentName
		String studentName = request.getParameter("studentName");
		//convert the data into all Upper Case 
		studentName = studentName.toUpperCase();
		//create the message 
		String result = "Yo !" + studentName;
		// add the message to the modal
		
		model.addAttribute("message",result);
		return "helloworld";
	}
	
	//Use the spring @RequestParam to basically resolve the request here
	
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDudeWithRequestParam(@RequestParam("studentName") String studentName, Model model) {
		// read the request studentName
		// String studentName = request.getParameter("studentName");
		//convert the data into all Upper Case 
		studentName = studentName.toUpperCase();
		//create the message 
		String result = "Hey My friend i am from V3 !" + studentName;
		// add the message to the modal
		
		model.addAttribute("message",result);
		return "helloworld";
	}
}
