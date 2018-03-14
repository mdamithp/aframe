package cucumber.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import supportfiles.Driver;

public class Test_Login_Page_SignIn {

	@Given("^navigateLoginPage$")
	public void navigateloginpage() {
		Driver.goTo("firefox");
		LoginPage.navigateToLogin();

	}

	@When("^signInAccount$")
	public void signinaccount() {
		LoginPage.SignIn("mdamithp@gmail.com", "12345");

	}

	@Then("^able to login to my account$")
	public void able_to_login_to_my_account() {
		Assert.assertEquals("My account - My Store", Driver.driver.getTitle());

	}

}
