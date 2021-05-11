package com.ojas.app.SpringXmlConfiguration;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.app.SpringXmlConfiguration.model.Sample1;

public class App1 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle.xml");
		Sample1 s1 = (Sample1) context.getBean("sampleObj");
		s1.display();
		context.registerShutdownHook();
	}
	
}
