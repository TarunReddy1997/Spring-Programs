package or.js.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean(name="p1")
	public Person personObj()
	{
		Person p1=new Person();
		return p1;
	}
}
