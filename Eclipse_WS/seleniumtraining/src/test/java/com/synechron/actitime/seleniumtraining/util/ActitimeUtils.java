package com.synechron.actitime.seleniumtraining.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeUtils extends DriverUtils
{
	
	public static void login(String username, String password)  {
		System.out.println("--- Performing login using " + username + " and " + password);
		type("id", "username", username);
		type("name", "pwd", password);
		click("id", "loginButton");
		pause(3000);
		validateTitle("actiTIME - Enter Time-Track");
		waitForVisiblility(getElement("xpath", "//td[@class='pagetitle' and contains(text(),'Enter')]"), "Enter Time-Track");
		
	}
	
	public static void selectModule(String modulename) 
	{
		System.out.println("--- Selecting " + modulename + " module ");
		switch (modulename.toUpperCase()) {
		case "TASKS":
			ActitimeUtils.click("xpath", "//div[text()='TASKS']/parent::a");
			validateTitle("actiTIME - Task List");
			break;
		case "REPORTS":
			ActitimeUtils.click("xpath", "//div[text()='REPORTS']/parent::a");
			break;
		case "USERS":
			ActitimeUtils.click("xpath", "//div[text()='USERS']/parent::a");
			break;

		default:
			break;
		}
		
	}
	
	public static void createCustomer(String cn, String cd) {
		System.out.println("--- Creating Customer " + cn + " and " + cd + "---");
		ActitimeUtils.click("xpath", "//div[@class='addNewContainer']");
		ActitimeUtils.click("xpath", "//div[@class='item createNewCustomer ellipsis']");

		ActitimeUtils.type("id", "customerLightBox_nameField", cn);
		ActitimeUtils.type("id", "customerLightBox_descriptionField", cd);
		ActitimeUtils.click("id", "customerLightBox_commitBtn");
		
		WebDriverWait wait =  new WebDriverWait(driver, 10);
		WebElement successMsgEle = wait.until(ExpectedConditions.visibilityOf(ActitimeUtils.getElement("xpath", "//div[@class='toast']")));
		System.out.println("Success message displayed - " + successMsgEle.getText());
		
		wait.until(ExpectedConditions.invisibilityOf(successMsgEle));
		
	}
	
	public static void logout()
	{
		System.out.println("--- Logout  of Application ---");
		click("id", "logoutLink");
		validateTitle("actiTIME - Login");
	//	driver.close();
	}
}
