package com.testng.selenium;

import java.util.ArrayList;
import java.util.List;

public class DDDdd {

	
	public void testexception() {
		try {
			System.out.println("a");
			cal();
			
		} catch (Exception e) {
			System.out.println("b");
		}
//		finally {
//			System.out.println("c");
//		}
		
	}
	
	public String cal() {
		
		List<String> li = new ArrayList<String>();
		
		li.add("abc");
		li.add("def");
		
		return li.get(1);
	}
	public static void main(String[] args) {
		DDDdd  dd = new DDDdd();
		dd.testexception();
	}
}
