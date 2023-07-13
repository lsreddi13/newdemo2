package com.testng.selenium.actiopns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoDropdown {
	WebDriver driver;

	@Test
	public void test() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();
		// find dropdown locator
//		id="searchDropdownBox";
		WebElement listbox = driver.findElement(By.id("searchDropdownBox"));

//		listbox.click();
		Thread.sleep(3000);

		List<WebElement> li = driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));

		System.out.println(li.size());

		for (WebElement wes : li) {
//			we.click();
			String value = wes.getText();
//			clickValue("baby", value, wes);
			if (value.equalsIgnoreCase("baby")) {
				wes.click();
				break;
			}
			

		}

	}

	public void clickValue(String v, String val, WebElement we) throws InterruptedException {
		Thread.sleep(2000);
		if (val.equalsIgnoreCase(v)) {
			we.click();

		} else {
//			System.out.println("baby not found");
		}

	}

}
