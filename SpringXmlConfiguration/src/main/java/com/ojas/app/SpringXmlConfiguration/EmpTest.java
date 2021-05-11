package com.ojas.app.SpringXmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.app.SpringXmlConfiguration.model.Employee;

public class EmpTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("empContext.xml");
		Employee employee =(Employee) context.getBean("empObj");
		System.out.println(employee);
	
	}
}
