package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import pages.LoginPage;
import supportfiles.Driver;

public class Test_Login_Page_SignIn {
	@BeforeClass
	public static void navigateLoginPage() {

		Driver.goTo("firefox");
		LoginPage.navigateToLogin();
	}

	@Test
	public void signInAccount() {
		LoginPage.SignIn("mdamithp@gmail.com", "12345");
		Assert.assertEquals("My account - My Store", Driver.driver.getTitle());
	}

	@AfterClass
	public static void driverClose() {
		Driver.closeDriver();
	}

}
