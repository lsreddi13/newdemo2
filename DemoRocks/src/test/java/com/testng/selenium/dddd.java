package com.testng.selenium;

public class dddd {
public static void main(String[] args) {
	String str2 = "Hello welcome";
	strFunc(str2, 0);
	
	
	/*
	 * int s = 5; System.out.println(s++ + s-- + ++s + --s + s );
	 * 
	 * 
	 * for(int i=0; ; ) { System.out.println(i); }
	 */
	
	
}





public static void strFunc(String s, int i) {
	
	if(i==s.length())
		return;
		
	else if(s.charAt(i)!=' ')
		
	System.out.println(s.charAt(i));
	strFunc(s, i+1);
}
}
