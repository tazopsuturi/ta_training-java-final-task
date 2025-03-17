package com.epam.training.student_tamaz_psuturi.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends AbstractPage{
	private static final String MAIN_PAGE_URL = "https://www.saucedemo.com/inventory.html";

	public MainPage(WebDriver driver) {
		super(driver);
	}
	
	private final By pageHeader = By.xpath("//div[@class='app_logo']");
	
	public String getPageTitle() {
		WebElement pageTitle = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
				.until(ExpectedConditions.presenceOfElementLocated(pageHeader));
		return pageTitle.getText();
	}
	
	@Override
	public MainPage openPage() {
		driver.get(MAIN_PAGE_URL);
		return this;
	}
}
