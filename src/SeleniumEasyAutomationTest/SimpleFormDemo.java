package SeleniumEasyAutomationTest;


import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleFormDemo {
	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"url"}) 
	    public void SetUp(String url){
		System.setProperty("webdriver.chrome.driver", "C://Browser_Drivers//chromedriver.exe");
	    driver = new ChromeDriver();              
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
/*	@Test
	public void SingleInputField(){
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Simple Form Demo")).click();
		driver.findElement(By.id("user-message")).sendKeys("welcome to first test for Single Input Field");
		driver.findElement(By.xpath("//button[text()='Show Message']")).click();
		String s =driver.findElement(By.id("display")).getText();
		
	 System.out.println(s);
	Assert.assertEquals(s, "welcome to first test for Single Input Field");	
	}
	
	
	@Test
	public void TwoInputFields(){
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Simple Form Demo")).click();
		driver.findElement(By.id("sum1")).sendKeys("2");
		driver.findElement(By.id("sum2")).sendKeys("4");
		
		driver.findElement(By.xpath("//button[text()='Get Total']")).click();
		String s1 =driver.findElement(By.id("displayvalue")).getText();
		System.out.println(s1);
		Assert.assertEquals(s1, "6");	
		
	}
	@Test
	public void CheckBOxDemo() throws InterruptedException{
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Checkbox Demo")).click();

		WebElement option1 = driver.findElement(By.id("isAgeSelected"));									
        option1.click();			
        
			Thread.sleep(5000);
	
        driver.findElement(By.id("txtAge")).isDisplayed();
		
	}
	
	@Test
	public void MultipleCheckboxDemo() throws InterruptedException{
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Checkbox Demo")).click();
		
		List < WebElement> els = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(els.size());
		els.get(2).click();
		els.get(4).click();	
		driver.findElement(By.id("check1")).click();
		
		// Check if all check boxes selected or not if not select the check box
		List < WebElement> els1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<els.size();i++){
			if(els.get(i).isSelected()){
				System.out.println(els1.get(i).isSelected());
			} else els1.get(i).click();

		}	
	}
	
	@Test
	public void SelectDropdownList(){
			driver.findElement(By.linkText("Input Forms")).click();
			driver.findElement(By.linkText("Select Dropdown List")).click();
			
			WebElement drop= driver.findElement(By.id("select-demo"));
			Select Sel= new Select(drop);
		Sel.selectByVisibleText("Sunday");  
		
		String s =driver.findElement(By.xpath("//*[contains(text(), 'Day selected :- Sunday')]")).getText();
		boolean b1 = driver.findElement(By.xpath("//*[contains(text(), 'Day selected :- Sunday')]")).isDisplayed();
		System.out.println(s);
		
		Assert.assertTrue(b1);
		
	}
	@Test
	public void InputFormSubmit(){
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Input Form Submit")).click();
	    driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("bharat");
	    driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("bil");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bha@gmail.com");
	    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("7709788653");	    
	    driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Pune- Yerwada 443205");	    
	    driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
	    
	    Select state= new Select(driver.findElement(By.xpath("//select[@name='state']")));
	    state.selectByVisibleText("Indiana");
	    
	    
	    
	    driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("44320");
	    driver.findElement(By.xpath("//input[@name='website']")).sendKeys("GreenIndia");
	    
	    driver.findElement(By.xpath("//input[@type='radio' and @value='yes']")).click();
	    
	
	driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("this is test project for Input Form Submit");
	
	driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-default'] ")).click();
	
	
	
	}
	
	@Test
	public void AjaxFormSubmit(){
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Ajax Form Submit")).click();
		driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Bharat Bilhore");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("This is text area");
		
		driver.findElement(By.xpath("//input[@type='button' and @id='btn-submit']")).click();
		
	}
	

	@Test
	public void JQuerySelectdropdown() throws InterruptedException{
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("JQuery Select dropdown")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[@id='select2-country-container'] //parent::span[@role='combobox']")).click();
		
		Thread.sleep(7000);
	driver.findElement(By.xpath("//ul[@id='select2-country-results']//child::li[contains(text(), 'India')]")).click();
		
}
	
	@Test
	public void JQuerySelectdropdownMultiSelect() throws InterruptedException{
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("JQuery Select dropdown")).click();
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Select state(s)']")).click();
		Thread.sleep(7000);
		
}
	
	@Test
	public void JQuerySelectdropdownWithCategory() throws InterruptedException{
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("JQuery Select dropdown")).click();
		
		Select sel =new Select(driver.findElement(By.xpath("//select[@id='files']")));
		//driver.findElement(By.xpath("//select[@id='files']")).click();
	
		sel.selectByVisibleText("C");
		Thread.sleep(7000);
			
}*/
	public void Datepickers(){
		driver.findElement(By.linkText("Datepickers")).click();
		driver.findElement(By.linkText("Bootstrap Date Picker")).click();
	}
	
	
	@AfterMethod
	public void TearDown(){
		driver.quit();
	 }	    
		
}
	


