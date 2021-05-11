package or.j.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean(name="c1", initMethod="immediatelyAfter",destroyMethod="immediatelyBefore")
	public Car carObeject()
	{
		Car c1=new Car();
		return c1;
	}
}
