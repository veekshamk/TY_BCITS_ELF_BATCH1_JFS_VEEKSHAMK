package com.bcits.springcore.annotations.beans;

import com.bcits.springcore.annotations.interfaces.Animal;

public class Goat implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating Grass....");
	}

	@Override
	public void speak() {
		System.out.println("Meh! Meh! Meh!!!!");
	}

}
