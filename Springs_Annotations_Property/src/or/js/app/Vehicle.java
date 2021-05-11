package or.js.app;

import org.springframework.beans.factory.annotation.Value;

public class Vehicle 
{
	@Value("${cNo}")
	private String carNo;
	
	@Value("${cBrand}")
	private String carBrand;
	
	@Value("${cColor}")
	private String carColor;

	@Override
	public String toString() {
		return "Vehicle [carNo=" + carNo + ", carBrand=" + carBrand + ", carColor=" + carColor + "]";
	}
	
	
	
}
