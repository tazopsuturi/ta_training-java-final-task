package com.epam.training.student_tamaz_psuturi.page;

import com.epam.training.student_tamaz_psuturi.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends AbstractPage {
	
	private final Logger logger = LogManager.getRootLogger();
	private final String LOGIN_PAGE_URL = "https://www.saucedemo.com/";
	
	@FindBy(xpath = "//input[contains(@class, 'input_error') and @type='text']")
	private WebElement inputUsername;
	
	@FindBy(xpath = "//input[contains(@class, 'input_error') and @type='password']")
	private WebElement inputPassword;
	
	@FindBy(xpath = "//input[@class='submit-button btn_action']")
	private WebElement buttonLogin;
	
	@FindBy(xpath = "//h3[@data-test='error']")
	private WebElement errorMessage;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	
	@Override
	public LoginPage openPage() {
		driver.navigate().to(LOGIN_PAGE_URL);
		logger.info("Login page opened");
		return this;
	}
	
	public LoginPage enterUsername(String username) {
		inputUsername.sendKeys(username);
		logger.info("Entered username: " + username);
		return this;
	}
	
	public LoginPage clearUserName() {
		inputUsername.clear();
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		inputPassword.sendKeys(password);
		logger.info("Entered password");
		return this;
	}
	
	public LoginPage clearPassword() {
		inputPassword.clear();
		return this;
	}
	
	public LoginPage clickLoginButton() {
		buttonLogin.click();
		logger.info("Clicked login button");
		return this;
	}
	
	public MainPage login(User user) {
		enterUsername(user.getUsername());
		enterPassword(user.getPassword());
		buttonLogin.click();
		return new MainPage(driver);
	}
	
	public String errorMessageString() {
		return errorMessage.getText();
	}
}
