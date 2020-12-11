package com.synechron.actitime.seleniumtraining.util;

public class GlobalVariables {
	
	public static final String url = FileUtils.getPropertyValue("url");
	public static final String username = FileUtils.getPropertyValue("username");
	public static final String password = FileUtils.getPropertyValue("password");
	public static final String browser = FileUtils.getPropertyValue("browser");
	public static final String formyURL = FileUtils.getPropertyValue("formyurl");
	public static final String node1= FileUtils.getPropertyValue("node1");
	public static final String node2= FileUtils.getPropertyValue("node2");
	/*
	 * public static void initializeGlobals() { url =
	 * FileUtils.getPropertyValue("url"); username =
	 * FileUtils.getPropertyValue("username"); password =
	 * FileUtils.getPropertyValue("password"); browser =
	 * FileUtils.getPropertyValue("browser"); }
	 */
}
