package com.demo.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginlocators {

	WebDriver drivers;
	
	public loginlocators(WebDriver drivers)
{
	this.drivers= drivers;
}
	
	
public By email  = By.name("email");

public By password =  By.name("passowrd");

public By submitbtn = By.xpath("//button[@class='form-control btn btn-primary']");

public WebElement getemail() {
	return drivers.findElement(email);
}

public WebElement getpwd() {
	return drivers.findElement(password);
	
}

public WebElement getsubmitbtn() {
	return drivers.findElement(submitbtn);
}

}
