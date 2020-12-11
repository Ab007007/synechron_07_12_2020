package com.synechron.actitime.seleniumtraining.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;
import com.synechron.actitime.seleniumtraining.util.FileUtils;
import com.synechron.actitime.seleniumtraining.util.GlobalVariables;

public class LoginTestUsingGrid {

	public static void main(String[] args) throws MalformedURLException {
		
		ActitimeUtils.getRemoteDriver(GlobalVariables.browser,GlobalVariables.node2);
		ActitimeUtils.launch(GlobalVariables.url);
		ActitimeUtils.login(GlobalVariables.username, GlobalVariables.password);
		ActitimeUtils.logout();
		
	}

	



}
