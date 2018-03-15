package cucumber.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import modules.ScreenShot;
import pages.HomePage;
import supportfiles.Driver;

public class Test_Home_Page {

	@Given("^Navigate to home page$")
	public void navigate_to_home_page() {
		Driver.goTo("firefox");
		HomePage.navigateToHome();
		ScreenShot.takeScreenShot(Driver.driver, "C:/Users/millaniyage.perera/Desktop/aframe/aframerepo/aframe/target/ScreenShots/abc.png");
	}

	@When("^Insert search text as \"([^\"]*)\" in search box$")
	public void insert_search_text_as_in_search_box(String text) {
		HomePage.Search(text);

	}

	@Then("^Verify search page as title \"([^\"]*)\"$")
	public void verify_search_page_as_title(String title) {
		Assert.assertEquals(title, Driver.driver.getTitle());

	}

	@And("^Close the browser$")
	public void close_the_browser() {
		Driver.closeDriver();

	}

}
