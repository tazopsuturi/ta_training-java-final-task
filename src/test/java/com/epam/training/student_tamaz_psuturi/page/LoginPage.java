package com.epam.training.student_tamaz_psuturi.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage{
	
	private final Logger logger = LogManager.getRootLogger();
	private final String LOGIN_PAGE_URL = "https://www.saucedemo.com/";
	
	@FindBy(id = "user-name")
	private WebElement inputUsername;
	
	@FindBy(id = "password")
	private WebElement inputPassword;
	
	@FindBy(id = "login-button")
	private WebElement buttonLogin;
	
	protected LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	
	@Override
	protected AbstractPage openPage() {
		return null;
	}
}
