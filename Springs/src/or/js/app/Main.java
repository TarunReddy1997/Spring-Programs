package or.js.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		
		//Configure SpringContainer
		ApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
		
		//To fetch particular type of object
		Hello h2=(Hello) context.getBean("h1");
		Hello hello=(Hello) context.getBean("h2");
		
	}
}
