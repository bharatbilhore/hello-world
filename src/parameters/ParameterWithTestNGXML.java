package parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterWithTestNGXML {
	WebDriver driver;
	
	@Test
	@Parameters({"url","emailid"})
	
	public void parameterTest(String url, String emailid){
		
		System.setProperty("webdriver.chrome.driver", "C://Browser_Drivers//chromedriver.exe");
	    driver = new ChromeDriver();              
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	
	driver.findElement(By.id("email")).sendKeys(emailid);
	    
		
	}
	

}
