package com.bcits.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bcits.springcore.annotations.beans.MessageBean;
import com.bcits.springcore.annotations.mypostprocessors.MyBeanFactoryPostProcessor;
import com.bcits.springcore.annotations.mypostprocessors.MyBeanPostProcessor;

@Configuration
public class MessageConfig {
	
	@Bean(name="messageBean")
	public MessageBean getMessageBean() {
		MessageBean messageBean=new MessageBean();
		messageBean.setMessage("Welcome to Spring Core....");
		
		return messageBean;
	}
	@Bean
	public MyBeanPostProcessor getMyBPP() {
		return new MyBeanPostProcessor();
	}
	
	@Bean
	public MyBeanFactoryPostProcessor getMyBFPP() {
		return new MyBeanFactoryPostProcessor();
	}


}
