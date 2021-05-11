package or.js.app;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class CrossCutterConcern 
{
	@After("execution(public void eat())")
	public void walk()
	{
		System.out.println("walking");
	}

	@Before("execution(public void sleep())")
	public void gym() 
	{
		System.out.println("gym");
	}
}
