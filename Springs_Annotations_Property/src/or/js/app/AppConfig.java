package or.js.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("car.properties")
public class AppConfig 
{
	@Bean(name="v1")
	public Vehicle carObj()
	{
		Vehicle v1=new Vehicle();
		return v1;
	}
}
