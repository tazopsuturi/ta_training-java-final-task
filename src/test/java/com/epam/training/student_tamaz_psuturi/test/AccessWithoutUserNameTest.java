package com.epam.training.student_tamaz_psuturi.test;

import com.epam.training.student_tamaz_psuturi.model.User;
import com.epam.training.student_tamaz_psuturi.page.LoginPage;
import com.epam.training.student_tamaz_psuturi.service.UserCreator;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import org.junit.Test;

public class AccessWithoutUserNameTest extends CommonConditions {
	@Test
	public void loginWithoutUserName() {
		User testUser = UserCreator.withEmptyUsername();
		String usernameError = new LoginPage(driver)
				.openPage()
				.enterUsername(testUser.getUsername())
				.enterPassword(testUser.getPassword())
				.clearUserName()
				.clearPassword()
				.clickLoginButton()
				.errorMessageString();
		assertThat(usernameError,containsString("Username is required"));
	}
}
