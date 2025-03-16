package com.epam.training.student_tamaz_psuturi.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage{
	private static final String MAIN_PAGE_URL = "https://www.saucedemo.com/inventory.html";

	public MainPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='app_logo']")
	private WebElement pageHeader;
	
	public String getPageTitle() {
		return pageHeader.getText();
	}
	
	@Override
	public MainPage openPage() {
		driver.get(MAIN_PAGE_URL);
		return this;
	}
}
