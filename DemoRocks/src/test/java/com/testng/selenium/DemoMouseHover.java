package com.testng.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoMouseHover {

	WebDriver driver;

	@Test
	public void test() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in");

		WebElement clickable = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions ac = new Actions(driver);

		ac.moveToElement(clickable).contextClick().build().perform();
		

	}
}
