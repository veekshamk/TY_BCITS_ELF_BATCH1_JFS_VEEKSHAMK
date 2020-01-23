package com.bcits.springcore.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.bcits.springcore.annotations.interfaces.Animal;

import lombok.Data;
@Data
public class Pet {
	private String name;
	
	@Autowired
	private Animal animal;

}
