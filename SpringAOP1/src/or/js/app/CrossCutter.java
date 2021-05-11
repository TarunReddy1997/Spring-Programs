package or.js.app;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class CrossCutter 
{
	@AfterThrowing("execution(public void eat())")
	public void walk()
	{
		System.out.println("walking");
	}
	
	@AfterReturning("execution(public void gym())")
	public void gym()
	{
		System.out.println("gym");
	}
	
	@Around("execution(public void start())")
	public void end()
	{
		System.out.println("ending");
	}
}
