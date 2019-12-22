package com.demo.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Baseclass2 {

	public static WebDriver driver = null;
	
	@BeforeMethod
public void initilize ()
{
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		   
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();

	}
}
