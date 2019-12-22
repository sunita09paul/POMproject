package com.demo.action;

import com.demo.locators.loginlocators;

public class logaction extends Baseclass2{

	loginlocators loginloc = new loginlocators(driver);
	
	public void login() {
		loginloc.getemail().sendKeys("akshata.tsol+101@gmail.com");
		loginloc.getpwd().sendKeys("jhfjhf");
		loginloc.getpwd().sendKeys("Sunita");

		loginloc.getsubmitbtn().click();
	}
	}
