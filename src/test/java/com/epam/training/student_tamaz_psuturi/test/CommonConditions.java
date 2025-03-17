package com.epam.training.student_tamaz_psuturi.test;

import com.epam.training.student_tamaz_psuturi.driver.DriverSingleton;
import com.epam.training.student_tamaz_psuturi.utils.TestListener;
import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Listeners;

@Listeners({TestListener.class})
public class CommonConditions {

	protected WebDriver driver;
	
	@Before()
	public void setUp()
	{
		driver = DriverSingleton.getDriver();
	}
	
	@After()
	public void stopBrowser()
	{
		DriverSingleton.closeBrowser();
	}
}
