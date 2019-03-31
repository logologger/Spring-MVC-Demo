package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {
	
	
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=3, message="Cannot be null")
	private String lastName;
	
	@Min(value = 0 , message = "value cannot be 0")
	@Max(value = 10 , message = "value cannot be greater then 10")
	@NotNull(message = "is required")
	public Integer freePasses;
	
	@Pattern(regexp = "^[a-zA-Z0-5]{5}" , message = "postal Code cannot be greater then 5 character")
	private String postalCode;
	
	@CourseCode
	private String courseCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	

}
