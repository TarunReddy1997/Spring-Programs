package or.j.app;

import org.springframework.beans.factory.annotation.Value;

public class Student 
{
	@Value("A1234")
	private String stdReg;
	
	public Student()
	{
		System.out.println("Student constructor");
	}
	@Value("123")
	private int no;
	
}
