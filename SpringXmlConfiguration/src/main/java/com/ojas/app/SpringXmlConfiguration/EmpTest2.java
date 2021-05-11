package com.ojas.app.SpringXmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.app.SpringXmlConfiguration.model.Employee2;

public class EmpTest2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext2.xml");
		Employee2 employee2 = (Employee2) context.getBean("sampleObj");
		System.out.println(employee2);
	}
	
}
