package com.synechron.actitime.seleniumtraining.popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;
import com.synechron.actitime.seleniumtraining.util.GlobalVariables;

public class ConfirmationPopUpDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getDriver(GlobalVariables.browser);
		ActitimeUtils.launch(GlobalVariables.url);
		ActitimeUtils.login(GlobalVariables.username, GlobalVariables.password);
		ActitimeUtils.selectModule("tasks");
		ActitimeUtils.click("xpath", "//div[@class='addNewContainer']");
		ActitimeUtils.click("xpath", "//div[@class='item createNewCustomer ellipsis']");

		ActitimeUtils.type("id", "customerLightBox_nameField", "JUNK");
		
		ActitimeUtils.click("id", "customerLightBox_cancelBtn");
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		ActitimeUtils.click("id", "customerLightBox_cancelBtn");
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		ActitimeUtils.logout();
		
	}
}
