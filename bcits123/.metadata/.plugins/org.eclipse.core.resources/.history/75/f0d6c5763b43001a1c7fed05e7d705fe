package com.bcits.springrest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

public class EntityManagerFactoryConfig {

//	@Bean
//	public LocalContainerEntityManagerFactoryBean getEntityManager() {
//		LocalContainerEntityManagerFactoryBean factoryBean= new LocalContainerEntityManagerFactoryBean();
//		factoryBean.setPersistenceUnitName("emsPersistenceUnit");
//
//		return factoryBean;
//	}
	
	@Bean
	public LocalEntityManagerFactoryBean getEntityManager() {
		LocalEntityManagerFactoryBean factoryBean= new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("emsPersistenceUnit");

		return factoryBean;
	}

}
