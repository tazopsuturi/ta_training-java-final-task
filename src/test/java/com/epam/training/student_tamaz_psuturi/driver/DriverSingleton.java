package com.epam.training.student_tamaz_psuturi.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverSingleton {
	public static WebDriver driver;
	
	private DriverSingleton() {
	}
	
	public static WebDriver getDriver() {
		if (driver == null) {
			String browser = System.getProperty("browser", "chrome").toLowerCase();
			
			switch (browser) {
				case "firefox":
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					break;
				case "edge":
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					break;
				case "safari":
					driver = new SafariDriver();
					break;
				case "internet explorer":
					WebDriverManager.iedriver().setup();
					driver = new EdgeDriver();
					break;
				case "chrome":
				default:
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					break;
			}
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public static void closeBrowser() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
