package com.bcits.springcore.annotations;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bcits.springcore.annotations.beans.EmployeeBean;
import com.bcits.springcore.annotations.config.EmployeeConfig;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		((ConfigurableApplicationContext)context).registerShutdownHook();
		
		EmployeeBean employeeBean1=context.getBean(EmployeeBean.class);
		
		System.out.println("Enter Employee-1 Name: ");
		employeeBean1.setName(sc.nextLine());
		System.out.println("Enter Employee-1 Age: ");
		employeeBean1.setAge(sc.nextInt());
		sc.nextLine();
		
		EmployeeBean employeeBean2=context.getBean(EmployeeBean.class);
		
		System.out.println("Enter Employee-2 Name: ");
		employeeBean2.setName(sc.nextLine());
		System.out.println("Enter Employee-2 Age: ");
		employeeBean2.setAge(sc.nextInt());
		
		System.out.println("Employee Name: "+employeeBean1.getName());
		System.out.println("Employee Age: "+employeeBean1.getAge());
		System.out.println("---------------------------");
		System.out.println("Employee Name: "+employeeBean2.getName());
		System.out.println("Employee Age: "+employeeBean2.getAge());
	}

}
 