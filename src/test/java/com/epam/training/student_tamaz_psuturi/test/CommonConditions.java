package com.epam.training.student_tamaz_psuturi.test;


import com.epam.training.student_tamaz_psuturi.driver.DriverSingleton;
import com.epam.training.student_tamaz_psuturi.utils.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners({TestListener.class})
public class CommonConditions {

	protected WebDriver driver;
	
	@BeforeMethod()
	public void setUp()
	{
		driver = DriverSingleton.getDriver();
	}
	
	@AfterMethod(alwaysRun = true)
	public void stopBrowser()
	{
		DriverSingleton.closeBrowser();
	}
}
