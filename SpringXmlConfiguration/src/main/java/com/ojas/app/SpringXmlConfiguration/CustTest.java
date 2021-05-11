package com.ojas.app.SpringXmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.app.SpringXmlConfiguration.model.Customer;

public class CustTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("customeraddress.xml");
		Customer customer = (Customer)context.getBean("custObj");
		System.out.println(customer);
	}
}
