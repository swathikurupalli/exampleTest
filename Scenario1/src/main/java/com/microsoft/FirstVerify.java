package com.microsoft;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstVerify {
	
	@Test
	public void Case1() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Duggu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.get("https://www.microsoft.com/en-us/edge/uninstall");
	     
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//button[contains(text(),'TELL US')]")).click();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	    
	
	}
}