package org.j.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		
	
	//configure SpringContainer
	ApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
	
	//Fetch beans from Spring container
	Student st=(Student) context.getBean("s1");
	
	System.out.println(st);
	
	}
}
