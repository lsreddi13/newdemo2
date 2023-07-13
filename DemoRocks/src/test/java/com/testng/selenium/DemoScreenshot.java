package com.testng.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoScreenshot {
	WebDriver driver;

	@Test
	public void testScreenshot() throws IOException {

		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.selenium.dev/documentation/webdriver/browser/windows/#takescreenshot");

			WebElement e = driver.findElement(By.id("tabs-14-1-tab"));

			File srcFile1 = e.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile1, new File(".//screenshots//webElement.png"));

			File srcFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File dstFile = new File(".//screenshots//eeee.png");

			FileUtils.copyFile(srcFile2, dstFile);

			FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
					new File(".//screenshots//eeee.png"));

//			driver.quit();

		} catch (Exception e) {
			System.out.println("hello i am here in the catch");

			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File(".//screenshots//ffff.png"));
		} finally {
			System.out.println("this is finally method.");
		}

	}

}
