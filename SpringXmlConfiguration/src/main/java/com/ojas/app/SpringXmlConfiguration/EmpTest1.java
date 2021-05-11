package com.ojas.app.SpringXmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.app.SpringXmlConfiguration.model.Employee1;

public class EmpTest1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext1.xml");
		Employee1 employee1 =(Employee1) context.getBean("empObj");
		System.out.println(employee1);
	}
}
