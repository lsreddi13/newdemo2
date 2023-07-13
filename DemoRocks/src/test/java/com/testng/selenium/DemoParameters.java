package com.testng.selenium;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoParameters {

	@Parameters({ "emp_name", "PWD" })
	@Test
	public void testSingleString(String name, String P2) {
	  System.out.println("Invoked testString " + name);
	  System.out.println("PWD testString " + P2);
	}
	
}
