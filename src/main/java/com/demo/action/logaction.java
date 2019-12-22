package com.demo.action;

import com.demo.locators.loginlocators;

public class logaction extends Baseclass2{

	loginlocators loginloc = new loginlocators(driver);
	
	public void login() {
		loginloc.getemail().sendKeys("akshata.tsol+101@gmail.com");
<<<<<<< HEAD
		loginloc.getpwd().sendKeys("jhfjhf");
		loginloc.getpwd().sendKeys("Sunita");

=======
		loginloc.getpwd().sendKeys("dfkjdfhdskjfeyre");
>>>>>>> fb8f7f19be52834cc76639072e08b9b2bb50a517
		loginloc.getsubmitbtn().click();
	}
	}
