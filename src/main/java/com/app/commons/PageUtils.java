package com.app.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PageUtils {

	public static WebDriver driver;

	public static void openPage(String url) {
		System.out.println(driver);
		driver.get(url);
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUpDriver(String browser) {
		System.out.println("212"+browser);
		if (browser == "chrome") {
			System.out.println(browser);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}
}
