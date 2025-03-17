package com.epam.training.student_tamaz_psuturi.test;

import com.epam.training.student_tamaz_psuturi.model.User;
import com.epam.training.student_tamaz_psuturi.page.LoginPage;
import com.epam.training.student_tamaz_psuturi.service.UserCreator;
import org.junit.Assert;
import org.junit.Test;

public class UserAccessTest extends CommonConditions {
	@Test
	public void oneCanLogin() {
		User testUser = UserCreator.withCredentialsFromProperty();
		String loggedInUserName = new LoginPage(driver)
				.openPage()
				.login(testUser)
				.getPageTitle();
		Assert.assertEquals(loggedInUserName, "Swag Labs");
	}
}
