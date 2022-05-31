package com.testng.practiceTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgPractice1Test  {

	@Test(dataProvider = "logindata")

	public void practice1Test() {
		
		
		Reporter.log("hiiii",true);

	}
	



}
