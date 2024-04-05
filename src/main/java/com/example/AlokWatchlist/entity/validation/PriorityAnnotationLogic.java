package com.example.AlokWatchlist.entity.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import jakarta.annotation.Priority;


public class PriorityAnnotationLogic implements ConstraintValidator<Priority, String>{
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value.trim().length() == 1 && "LMH" .contains(value.trim());
	}
	
}


