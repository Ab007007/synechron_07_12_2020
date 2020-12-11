package com.synechron.actitime.seleniumtraining.util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtils {

	public static WebDriver driver = null;

	public static WebDriver getDriver() {
		System.out.println("--- Creating Browser Object ---");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

	public static WebDriver getDriver(String type) {
		System.out.println("--- Creating Browser Object ---" + type);

		switch (type.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().browserVersion("87.0.4280.88").setup();
			;
			driver = new ChromeDriver();
			break;
		case "ff":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("please check the supported drivers in framework");
			break;
		}
		String timeout = FileUtils.getPropertyValue("timeout");
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(timeout), TimeUnit.SECONDS);
		driver.manage().window().maximize();
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
		System.out.println("Clicking on the element " + type + " and  " + value);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(getElement(type, value)));
		getElement(type, value).click();

	}

	public static void type(String type, String value, String text) {
		System.out.println("Typing on the element " + type + " and  " + value + " and " + text);
		getElement(type, value).sendKeys(text);
	}

	public static String getText(String type, String value) {
		String textOnScreen = null;
		System.out.println("Reading text on the WebElement " + type + " and  " + value);
		textOnScreen = getElement(type, value).getText();

		return textOnScreen;
	}

	public static void waitForVisiblility(WebElement ele, String txt) {
		FluentWait<WebElement> wait = new FluentWait<WebElement>(ele).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class).ignoring(Exception.class);

		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {
			public Boolean apply(WebElement ele) {
				if (ele.getText().equals(txt)) {
					System.out.println("Found Element.............." + ele.getText());
					return true;
				} else {
					System.out.println("Waiting for the element!!!!");
					return false;
				}

			}
		};

		wait.until(fun);
	}

	public static void pause(int ms) {

		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void validateTitle(String expectedTitle) {
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}

	public static String getDateAndTime() {
		Date d = new Date();
		return d.toString().replace(" ", "_").replace(":", "_");
	}

	public static void captureScreenShot() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenShot = ts.getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(screenShot,
				new File("screenshots/Fail_Screen_" + ActitimeUtils.getDateAndTime() + ".png"));
	}

}
