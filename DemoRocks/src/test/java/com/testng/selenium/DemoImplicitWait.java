package com.testng.selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoImplicitWait {
	WebDriver driver;

	@BeforeMethod
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	
	@AfterMethod
	public void close() {
		
	}
	
	
	@Test
	public void ggggg() {
//	public static void main(String[] args) {

		driver.get("http://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("I am test1");
		//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void abc() {
//		public static void main(String[] args) {

		driver.get("http://www.eenadu.net");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("I am test3");
		//
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void ddddd() {
//	public static void main(String[] args) {

		driver.get("http://www.sakshi.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("I am test4");
	}

	@Test
	public void kkkk() {
//	public static void main(String[] args) {

		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("I am test2");
		//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
}
