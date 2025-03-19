package com.epam.training.student_tamaz_psuturi.stepdefinitions;

import com.epam.training.student_tamaz_psuturi.driver.DriverSingleton;
import com.epam.training.student_tamaz_psuturi.model.User;
import com.epam.training.student_tamaz_psuturi.page.LoginPage;
import com.epam.training.student_tamaz_psuturi.service.UserCreator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageSteps {
	private final Logger logger = LogManager.getRootLogger();
	private WebDriver driver;
	private LoginPage loginPage;
	
	public LoginSteps() {
		this.driver = DriverSingleton.getDriver(); // Use Singleton for consistency
		this.loginPage = new LoginPage(driver);
	}
	
	@Given("I open the login page")
	public void iOpenTheLoginPage() {
		driver.manage().window().maximize();
		loginPage.openPage();
		logger.info("Opened the login page.");
	}
	
	@When("I enter valid username and password")
	public void iEnterValidUsernameAndPassword() {
		User validUser = UserCreator.withCredentialsFromProperty();
		loginPage.login(validUser);
	}
	
	@When("I enter an empty username and a valid password")
	public void iEnterAnEmptyUsernameAndAValidPassword() {
		User invalidUser = UserCreator.withEmptyUsername();
		loginPage.login(invalidUser);
	}
	
	@When("I enter a valid username and an empty password")
	public void iEnterAValidUsernameAndAnEmptyPassword() {
		User invalidUser = UserCreator.withEmptyPassword();
		loginPage.login(invalidUser);
	}
	
	@And("I click on the login button")
	public void iClickOnTheLoginButton() {
		loginPage.login();
	}
	
	@Then("I should see an error message {string}")
	public void iShouldSeeAnErrorMessage(String expectedMessage) {
		Assert.assertEquals(expectedMessage, loginPage.getErrorMessage());
		driver.quit();
	}
}
}
