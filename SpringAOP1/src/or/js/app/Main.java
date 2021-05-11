package or.js.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("sample.xml");
		
		Person p1=(Person) applicationContext.getBean("person");
		p1.start();
		p1.eat();
		p1.sleep();
	}
}
