package com.testng.selenium.actiopns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoActions {
	WebDriver driver;

	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://www.google.com");

//		   driver.get("https://www.selenium.dev/selenium/web/single_text_input.html");

//	        Platform platformName = ((HasCapabilities) driver).getCapabilities().getPlatformName();

//		 Keys cmdCtrl = platformName.is(Platform.WINDOWS) ? Keys.CONTROL : Keys.;

		WebElement textField = driver.findElement(By.name("q"));
		Actions ac = new Actions(driver);
		ac.sendKeys(textField, "Selenium!")
//		.sendKeys(Keys.ARROW_LEFT).keyDown(Keys.SHIFT).sendKeys(Keys.ARROW_UP)
//				.keyUp(Keys.SHIFT)
				.sendKeys(Keys.CONTROL + "a")
//	                .sendKeys("xvv")
				.sendKeys(Keys.CONTROL + "c")
				.sendKeys(Keys.CONTROL + "x")
				.sendKeys(Keys.CONTROL + "v")
//	                .build()
				.perform();

		/*
		 * driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 * 
		 * WebElement we = driver.findElement(By.id("txtUsername"));
		 * we.sendKeys("Admin");
		 * 
		 * driver.findElement(By.name("txtPassword")).sendKeys("ad" + Keys.BACK_SPACE);
		 * we.sendKeys(Keys.BACK_SPACE);
		 * 
		 * Actions ac = new Actions(driver);//
		 * 
		 * ac.moveToElement(we) //
		 * ac.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		 */ }

}
