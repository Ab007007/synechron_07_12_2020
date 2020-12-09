package com.synechron.actitime.seleniumtraining.autosuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String toolTip = driver.findElement(By.xpath("//a[@class='gb_D gb_vc']")).getAttribute("title");
	
		System.out.println(toolTip);
	
		driver.close();
	}

}
