package com.epam.training.student_tamaz_psuturi.test;

import com.epam.training.student_tamaz_psuturi.model.User;
import com.epam.training.student_tamaz_psuturi.page.LoginPage;
import com.epam.training.student_tamaz_psuturi.service.UserCreator;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class AccessWithoutPasswordTest extends CommonConditions {
	@Test
	public void loginWithoutPassword() {
		User testUser = UserCreator.withEmptyPassword();
		String passwordError = new LoginPage(driver)
				.openPage()
				.enterUsername(testUser.getUsername())
				.enterPassword(testUser.getPassword())
				.clearPassword()
				.clickLoginButton()
				.errorMessageString();
		
		assertThat(passwordError, containsString("Password is required"));
	}
}
