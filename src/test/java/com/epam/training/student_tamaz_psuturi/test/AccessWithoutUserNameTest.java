package com.epam.training.student_tamaz_psuturi.test;

import com.epam.training.student_tamaz_psuturi.model.User;
import com.epam.training.student_tamaz_psuturi.page.LoginPage;
import com.epam.training.student_tamaz_psuturi.service.UserCreator;
import jdk.internal.net.http.common.Log;
import org.junit.Assert;
import org.junit.Test;


public class AccessWithoutUserNameTest extends CommonConditions{
	@Test
	public void loginWithoutUserName() {
		User testUser = UserCreator.withCredentialsFromProperty();
		String usernameError = new LoginPage(driver)
				.openPage()
				.loginWithValidData(testUser)
				.errorMessageString();
		Assert.assertTrue(usernameError.contains("Username is required"));
	}
}
