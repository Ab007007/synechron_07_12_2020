package com.synechron.actitime.seleniumtraining.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;
import com.synechron.actitime.seleniumtraining.util.ExcelUtils;
import com.synechron.actitime.seleniumtraining.util.FileUtils;
import com.synechron.actitime.seleniumtraining.util.GlobalVariables;

public class CreateMultipleCustomer {

	static String sheetname = "customer-data";
	public static void main(String[] args) {
		GlobalVariables.initializeGlobals();
		ActitimeUtils.getDriver(GlobalVariables.browser);
		ActitimeUtils.launch(GlobalVariables.url);
		ActitimeUtils.login(GlobalVariables.username, GlobalVariables.password);
		ActitimeUtils.selectModule("tasks");
		
		int rowCount = ExcelUtils.rowCount(sheetname);
		String cn, cd;
		for(int i=1;i<rowCount;i++) {
			cn = ExcelUtils.getCellData(sheetname, i, 0);
			cd = ExcelUtils.getCellData(sheetname, i, 1);
			ActitimeUtils.createCustomer(cn, cd);
		
		}
		ActitimeUtils.logout();
		
	}

	

}
