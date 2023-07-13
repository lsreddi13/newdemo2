package com.testng.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DD {
	int i = 2;
	WebDriver driver;

	@Test(dataProvider = "getData")
	public void test(Integer a, String str) {
		
		
		 
	}

	@BeforeTest
	public void t2() {
		i = i + 5;
	}

	@DataProvider
	public Object[][] getData() {

		i = i * 10;
		return new Object[][] {{ 1, "a" } };
	}
}
