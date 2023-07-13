package com.testng.selenium;

import org.testng.annotations.Test;

public class DemoTestGroups {

	@Test(groups = { "smoke" })
	public void testMethod1() {
		System.out.println("i am testMethod1 smoke group.");
	}

	@Test(groups = { "smoke", "Regression" })
	public void testMethod2() {
		System.out.println("i am testMethod2 smoke group.");

	}
	
	@Test(groups = { "Regression" })
	public void testmethodRegression() {
		System.out.println("i am testmethodRegression regression method.");

	}

	@Test(groups = { "smoke" })
	public void testMethod3() {
		System.out.println("i am testMethod3 smoke group.");
	}

}
