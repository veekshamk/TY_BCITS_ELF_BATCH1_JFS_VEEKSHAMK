package com.bcits.springcore.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Car {
	private String company;
	
	@Autowired
	private Engine engine;

}
