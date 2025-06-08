package com.epam.training.student_tamaz_psuturi.stepdefinitions;

import com.epam.training.student_tamaz_psuturi.page.MainPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

public class MainPageSteps {
	private WebDriver driver;
	private MainPage mainPage;
	
	@Then("I should be logged in successfully")
	public void iShouldBeLoggedInSuccessfully() {
		assertEquals("Swag Labs", mainPage.getPageTitle(), "Page title do not equals to the expected name!");
		driver.quit();
	}
}
