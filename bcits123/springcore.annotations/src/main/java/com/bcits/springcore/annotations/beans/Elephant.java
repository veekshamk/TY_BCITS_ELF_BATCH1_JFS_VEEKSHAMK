package com.bcits.springcore.annotations.beans;

import com.bcits.springcore.annotations.interfaces.Animal;

public class Elephant implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating Sugarcane...");

	}

	@Override
	public void speak() {
		System.out.println("Trumpeting.....");
	}

}
