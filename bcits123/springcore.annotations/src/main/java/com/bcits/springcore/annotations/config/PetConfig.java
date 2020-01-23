package com.bcits.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.bcits.springcore.annotations.beans.Pet;

@Import(AnimalConfig.class)
@Configuration
public class PetConfig {

	@Bean
	public Pet getPet(){
		Pet myPet=new Pet();
		myPet.setName("Chintu");
		return myPet;
	}

}
