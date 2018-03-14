package supportfiles;

public class Browser {

	public static void navigateTo(String url) {
		Driver.driver.navigate().to(url);
	}

}
