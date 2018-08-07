package com.datadriven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.*;



public class HTMLUnitDriverRun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new HtmlUnitDriver();
		
		
		driver.get("https://www.bing.com");
		System.out.println("Waiting ");
		Thread.sleep(8000);
	String s= driver.getTitle();
		System.out.println(s);

		System.out.println("s");
		

	}

}
