package bb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Jenkin_Practice {
	
	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void m(){
		
		driver.get("http://www.bn.com");
		
	}
		
	

}
