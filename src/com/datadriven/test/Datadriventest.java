package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class Datadriventest {

	public static void main(String[] args) {
		
		
        Xls_Reader reader =new Xls_Reader("/Users/jbilhob/workspace/Test/src/com/testdata/HalfEbayTestData.xlsx");
        
   int rownum= reader.getRowCount("RegTestData");
   
   for(int rowcount=2; rowcount<=rownum; rowcount++){
        String firstname= reader.getCellData("RegTestData", "firstname",rowcount );
     System.out.println(firstname);
     
     String lastname= reader.getCellData("RegTestData", "lastname", rowcount);
     System.out.println(lastname);
     
     String Username= reader.getCellData("RegTestData", "Username", rowcount);
     System.out.println(Username);
     
     System.setProperty("webdriver.chrome.driver", "C://Browser_Drivers//chromedriver.exe");
     WebDriver driver = new ChromeDriver();              
     driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-en&flowName=GlifWebSignIn&flowEntry=SignUp");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
     driver.findElement(By.id("firstName")).sendKeys(firstname);
     driver.findElement(By.id("lastName")).sendKeys(lastname); //username
     driver.findElement(By.id("username")).sendKeys(Username);
     driver.quit();
   }
   
	}

}
