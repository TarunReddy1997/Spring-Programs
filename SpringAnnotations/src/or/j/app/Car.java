package or.j.app;

import org.springframework.beans.factory.annotation.Value;

public class Car 
{
	@Value("TS01A2433")
	private String carNo;
	
	public Car()
	{
		System.out.println("inside car constructor");
	}
	
	public void immAfter()
	{
		System.out.println("init method");
	}
}
