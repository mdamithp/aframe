package modules;

import supportfiles.Driver;

public class PopupHandle {
	
	public static void okButtom(){
		Driver.driver.switchTo().alert().accept();
		
	}
	public static void cancelButton(){
		Driver.driver.switchTo().alert().dismiss();
		
	}
	public static void captureAlertMessage(){
		Driver.driver.switchTo().alert().getText();
	}
	public static void sendDataToAlert(String sendtext){
		Driver.driver.switchTo().alert().sendKeys(sendtext);
	}
}
