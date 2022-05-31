package com.testng.practiceTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgPractice1Test  {

	@Test()

	public void practice1Test() {
		
	String browser=System.getProperty("BROWSER");
		Reporter.log(browser, true);
		Reporter.log("hiii", true);


	}
	



}
