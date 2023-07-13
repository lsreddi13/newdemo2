package com.testng.selenium;

public class sss {
	public static void main(String[] args) {

		String str = "Hello World";
		for (int i = 0;; i++) {
			if (i == str.length())
				break;
			else if(str.charAt(i) != ' ')
				System.out.println(str.charAt(i));
		}

	}
}
