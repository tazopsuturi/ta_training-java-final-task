package com.epam.training.student_tamaz_psuturi.stepdefinitions;

import com.epam.training.student_tamaz_psuturi.page.MainPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MainPageSteps {
	private WebDriver driver;
	private MainPage mainPage;
	
	@Then("I should be logged in successfully")
	public void iShouldBeLoggedInSuccessfully() {
		Assert.assertEquals("Swag Labs", mainPage.getPageTitle());
		driver.quit();
	}
}
