package com.synechron.actitime.seleniumtraining.util;

public class GlobalVariables {
	
	public static String url;
	public static String username;
	public static String password;
	public static String browser;

	public static void initializeGlobals() {
		url = FileUtils.getPropertyValue("url");
		username = FileUtils.getPropertyValue("username");
		password = FileUtils.getPropertyValue("password");
		browser = FileUtils.getPropertyValue("browser");
	}
}
