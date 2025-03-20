package com.epam.training.student_tamaz_psuturi.test;

import com.epam.training.student_tamaz_psuturi.model.User;
import com.epam.training.student_tamaz_psuturi.page.LoginPage;
import com.epam.training.student_tamaz_psuturi.service.UserCreator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import org.junit.Test;

public class UserAccessTest extends CommonConditions {
	private final Logger logger = LogManager.getRootLogger();
	
	@Test
	public void oneCanLogin() {
		logger.info("Entering oneCanLogin");
		
		User testUser = UserCreator.withCredentialsFromProperty();
		String loggedInUserName = new LoginPage(driver)
				.openPage()
				.login(testUser)
				.getPageTitle();
		
		logger.info("Login attempted. Checking assertions.");
		assertThat(loggedInUserName, containsString("Swag Labs"));
		
		logger.info("Test passed: User successfully logged in.");
	}
}
