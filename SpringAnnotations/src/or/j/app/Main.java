package or.j.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		//Configure Spring Container
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Fetch the bean
		Car cr=(Car) context.getBean("c1");
		
		System.out.println(cr);
	}
}
