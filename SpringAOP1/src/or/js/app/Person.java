package or.js.app;

import org.springframework.stereotype.Component;

@Component
public class Person 
{
	
	public void start()
	{
		System.out.println("beginning");
	}
	
	public void eat()
	{
		System.out.println("eating");
	}
	
	public void sleep()
	{
		System.out.println("sleeping");
	}
}
