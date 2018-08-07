package com.practice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTittleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUP(){
		System.setProperty("webdriver.chrome.driver", "C://Browser_Drivers//chromedriver.exe");
	     driver = new ChromeDriver(); 
	     driver.manage().deleteAllCookies();
	     driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.google.com/");
	    }
	@Test(expectedExceptions=NumberFormatException.class)
 public void googleTittleTest(){
	String s=	driver.getTitle();	
	Assert.assertEquals(s, "Google");
		
	}
	@Test
	public void gmailLinkTest(){
		boolean b= driver.findElement(By.linkText("Gmail")).isDisplayed();
			
		}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
