package com.synechron.actitime.seleniumtraining.util;

public class ActitimeUtils extends DriverUtils
{
	
	public static void login(String username, String password) {
		System.out.println("--- Performing login using " + username + " and " + password);
		type("id", "username", username);
		type("name", "pwd", password);
		click("id", "loginButton");
		
		waitForVisiblility(getElement("xpath", "//td[@class='pagetitle' and contains(text(),'Enter')]"), "Enter Time-Track");
	}
}
