package or.j.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean(name="std")
	public Student studentObj()
	{
		Student std=new Student();
		return std;
	}
}
