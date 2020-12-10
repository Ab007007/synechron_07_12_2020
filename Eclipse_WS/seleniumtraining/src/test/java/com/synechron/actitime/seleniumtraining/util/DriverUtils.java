package com.synechron.actitime.seleniumtraining.util;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class DriverUtils {

	public static WebDriver driver = null;

	public static WebDriver getDriver() {
		System.out.println("--- Creating Browser Object ---");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;

	}

	public static void launch(String url) {
		System.out.println("--- Launching the applicaiton ---" + url);
		driver.get(url);
	}

	public static WebElement getElement(String type, String value) {
		WebElement ele = null;
		System.out.println("Finding Element using " + type + " and " + value);
		switch (type.toLowerCase()) {
		case "id":
			ele = driver.findElement(By.id(value));

			break;
		case "name":
			ele = driver.findElement(By.name(value));

			break;
		case "classname":
			ele = driver.findElement(By.className(value));

			break;
		case "tagname":
			ele = driver.findElement(By.tagName(value));

			break;
		case "linktext":
			ele = driver.findElement(By.linkText(value));

			break;
		case "partiallinktext":
			ele = driver.findElement(By.partialLinkText(value));

			break;
		case "css":
			ele = driver.findElement(By.cssSelector(value));

			break;
		case "xpath":
			ele = driver.findElement(By.xpath(value));

			break;

		default:
			System.out.println("Please check the type");
			break;
		}
		
		return ele;

	}

	
	public static void click(String type, String value) {
		System.out.println("Clicking on the element " + type + " and  "+ value);
		getElement(type, value).click();
		
	}
	
	public static void type(String type, String value, String text) {
		System.out.println("Typing on the element " + type + " and  "+ value + " and " + text);
		getElement(type, value).sendKeys(text);
	}
	
	public static String getText(String type, String value)
	{
		String textOnScreen = null;
		System.out.println("Reading text on the WebElement "+ type + " and  "+ value);
		textOnScreen = getElement(type, value).getText();
		
		return textOnScreen;
	}
	
	public static void waitForVisiblility(WebElement ele, String txt)
	{
		FluentWait<WebElement> wait = new FluentWait<WebElement>(
				ele)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(1000))
				.ignoring(NoSuchElementException.class)
				.ignoring(Exception.class);
		
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() 
		{
			public Boolean apply(WebElement ele) {
				if(ele.getText().equals(txt)) {
					System.out.println("Found Element.............." + ele.getText());
					return true;
				}
				else {
					System.out.println("Waiting for the element!!!!");
					return false;
				}
			
			}
		};		
				
		wait.until(fun);
	}
	
	
}
