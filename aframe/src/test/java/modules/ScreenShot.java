package modules;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	//static WebDriver wd=Driver.driver;
	
	public static void takeScreenShot(WebDriver webdriver, String filepath){
		
		TakesScreenshot screenShot=((TakesScreenshot)webdriver);
		File srcFile=screenShot.getScreenshotAs(OutputType.FILE);
		File destFile=new File(filepath);
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		 
		
		
		
	}

}
