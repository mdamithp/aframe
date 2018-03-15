package pages;

import org.openqa.selenium.By;

import supportfiles.Browser;
import supportfiles.Driver;

public class HomePage {
	public static void Search(String searchtext) {
		Driver.driver.findElement(By.id("search_query_top")).sendKeys(searchtext);
		Driver.driver.findElement(By.name("submit_search")).click();
		

	}
public static void navigateToHome() {
		Browser.navigateTo("http://automationpractice.com/index.php");

	}

}
