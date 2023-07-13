package com.testng.selenium;

import org.testng.annotations.Test;

public class DemoTestGroups2 {

	@Test(groups = { "Regression" })
	public void testMethod1() {
		System.out.println("i am Regression group.");
	}

	@Test(groups = { "performance" })
	public void testMethod2() {
		System.out.println("i am performance group.");

	}
	
	@Test(groups = { "performance" })
	public void testmethodperformance() {
		System.out.println("i am performance method.");

	}

	@Test(groups = { "smoke" })
	public void testMethod3() {
		System.out.println("i am smoke group.");
	}

}
