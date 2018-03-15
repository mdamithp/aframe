package cucumber.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import supportfiles.Driver;

public class Test_Login_Page_SignInc {
	@Given("^Navigate to login page$")
	public void navigate_to_login_page() {
		Driver.goTo("firefox");
		LoginPage.navigateToLogin();

	}

	@When("^Sign in to account with username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void sign_in_to_account_with_username_as_and_password_as(String uname, String pass) {
		LoginPage.SignIn(uname, pass);

	}

	@Then("^Verify my account page as title \"([^\"]*)\"$")
	public void verify_my_account_page_as_title(String title) {
		Assert.assertEquals(title, Driver.driver.getTitle());
	}


}
