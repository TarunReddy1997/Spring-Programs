package or.js.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person pe=(Person) applicationContext.getBean("p1");
		
		System.out.println(pe);
		pe.eat();
		pe.sleep();
	}
}
