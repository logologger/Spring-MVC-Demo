package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.invoke.MethodType;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ ElementType.METHOD , ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	// define default value
	public String value() default "LUV";
	
	
	//define default message
	public String message() default "Must start with LUV";

	//define default groups
	public Class<?>[] groups() default{};
	
	//define default payload provide addition information 
	public Class<? extends Payload>[] payload() default {};
	
}
