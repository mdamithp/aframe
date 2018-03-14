package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import pages.LoginPage;
import supportfiles.Driver;

public class Test_Login_Page_Create_Account {
	@BeforeClass
	public static void navigateLoginPage() {

		Driver.goTo("firefox");
		LoginPage.navigateToLogin();
	}

	@Test
	public void validateLoginPage() {

		Assert.assertEquals("Login - My Store", Driver.driver.getTitle());

	}

	@Test
	public void createAnAccount() {
		LoginPage.CreateAccountEmail("mdamithp@gmail.com");
		LoginPage.CreateAccountPersonalInfoM("Mr", "damith","perera","12345");
	}

	@AfterClass
	public static void driverClose() {
		Driver.closeDriver();
	}

}
