package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import supportfiles.Browser;
import supportfiles.Driver;

public class LoginPage {

	public static void CreateAccountEmail(String email) {
		Driver.driver.findElement(By.id("email_create")).sendKeys(email);
		Driver.driver.findElement(By.id("SubmitCreate")).click();

	}

	public static void CreateAccountPersonalInfoM(String title, String firstname, String lastname, String password) {
		Driver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (title.equalsIgnoreCase("Mr")) {
			WebElement Title = Driver.driver.findElement(By.id("id_gender1"));
			Title.click();
		} else if (title.equalsIgnoreCase("Mrs")) {
			WebElement Title = Driver.driver.findElement(By.id("id_gender2"));
			Title.click();
		}

		WebElement FirstName = Driver.driver.findElement(By.id("customer_firstname"));
		FirstName.sendKeys(firstname);

	}

	public static void SignIn(String uname, String pass) {
		WebElement UserName = Driver.driver.findElement(By.id("email"));
		UserName.sendKeys(uname);
		WebElement Password = Driver.driver.findElement(By.id("passwd"));
		Password.sendKeys(pass);
		Driver.driver.findElement(By.id("SubmitLogin")).click();

	}

	public static void navigateToLogin() {
		Browser.navigateTo("http://automationpractice.com/index.php");
		Driver.driver.findElement(By.linkText("Sign in")).click();

	}

}
