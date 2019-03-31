package com.luv2code.springdemo.mvc.validation;



import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {


	String courseCodePrefix;
	
	@Override
	public boolean isValid(String courseCode, ConstraintValidatorContext theValidator) {
		// TODO Auto-generated method stub
		if(courseCode !=null) {
		boolean result =  courseCode.startsWith(courseCodePrefix);
		return result;
		}
		else {
			boolean result = true;
			return result;
		}
		
	}
	
	@Override
	public void initialize(CourseCode c1) {
		// TODO Auto-generated method stub
		courseCodePrefix = c1.value();
	}

}
