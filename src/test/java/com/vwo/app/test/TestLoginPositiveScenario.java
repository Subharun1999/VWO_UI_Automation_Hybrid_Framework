package com.vwo.app.test;

import com.vwo.app.base.CommonToAllTest;
import com.vwo.app.pages.pageObjectModel.LoginPage_POM;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestLoginPositiveScenario extends CommonToAllTest {

	WebDriver driver;

	@Test
	public void test_login() throws IOException {

		LoginPage_POM loginPagePom = new LoginPage_POM(driver);
		loginPagePom.openVWOLoginURL();
		String tc_passed = loginPagePom.loginWithValidCred();
		Assert.assertEquals(tc_passed, "Subho Das");
		System.out.println("TC passed");

	}
}
