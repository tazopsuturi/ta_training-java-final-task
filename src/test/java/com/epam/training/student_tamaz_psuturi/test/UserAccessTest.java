package com.epam.training.student_tamaz_psuturi.test;

import com.epam.training.student_tamaz_psuturi.model.User;
import com.epam.training.student_tamaz_psuturi.page.LoginPage;
import com.epam.training.student_tamaz_psuturi.service.UserCreator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserAccessTest extends CommonConditions {
	@Test
	public void oneCanLogin()
	{
		User testUser = UserCreator.withCredentialsFromProperty();
		String loggedInUserName = new LoginPage(driver)
				.openPage()
				.login(testUser)
				.userNameString();
		Assert.assertEquals(loggedInUserName, testUser.getUsername());
		//assertThat(loggedInUserName, is(equalTo(testUser.getUsername())));
	}

}
