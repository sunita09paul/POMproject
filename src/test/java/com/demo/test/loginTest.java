package com.demo.test;

import org.testng.annotations.Test;

import com.demo.action.Baseclass2;
import com.demo.action.logaction;

public class loginTest extends Baseclass2 {
	
	
	@Test
	public void login () {
		
		driver.get("https://stgclient.vetty.co/client/login");

		logaction loginTest =  new logaction();
		loginTest.login();
		
	}

}
