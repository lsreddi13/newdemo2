package com.testng.selenium;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demoTestNG {

	/*
	 * @BeforeSuite public void bfs() { System.out.println(" i am before suite"); }
	 * 
	 * @AfterSuite public void afs() { System.out.println(" i am after suite"); }
	 * 
	 * @BeforeTest public void bft() { System.out.println(" i am before test"); }
	 * 
	 * @AfterTest public void aft() { System.out.println(" i am after test"); }
	 * 
	 * @BeforeClass public void bfc() { System.out.println("i am before class"); }
	 * 
	 * @AfterClass public void afc() { System.out.println("I am after class"); }
	 */

	/*
	 * @BeforeMethod public void bfm() { System.out.println("i am before method"); }
	 * 
	 * @AfterMethod public void afm() { System.out.println("I am after method"); }
	 */

	@Test(priority = 1)
	public void login() {
		System.out.println("this is login method");
	}

	@Test(priority = 5, enabled = false)
	public void logout() {
		System.out.println("I am logout");
	}

	@Test(priority = 2, enabled = false)
	public void dashboardVerification() {
		System.out.println(" i am dashboard verification");
	}
	
	

	@Test()
	public void B() {
		System.out.println("i am create user");
		
		Assert.assertEquals(false, true);
		
	}

	@Test(dependsOnMethods = "B", alwaysRun = true, invocationCount = 10)
	public void A() {
		System.out.println("i am edit user");
	}

}
