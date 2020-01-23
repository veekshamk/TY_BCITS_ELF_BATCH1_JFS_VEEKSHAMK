package com.bcits.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bcits.springcore.annotations.beans.Engine;
@Configuration
public class EngineConfig {
	
	@Bean
	public Engine getEngine() {
		Engine engine=new Engine();
		engine.setCc(2300);
		engine.setType("Diesel");
		
		return engine;
	}

}
