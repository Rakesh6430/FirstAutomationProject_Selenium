package com.it.bd;

import org.testng.annotations.Test;

public class FirstTestAutomation extends BaseDriver{
    
	
	@Test
	
	public void firstTest() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/"); /*If want to open a url using get method*/
		Thread.sleep(5000);
	}
}
