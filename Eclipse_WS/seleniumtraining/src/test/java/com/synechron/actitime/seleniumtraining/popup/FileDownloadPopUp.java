package com.synechron.actitime.seleniumtraining.popup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;
import com.synechron.actitime.seleniumtraining.util.GlobalVariables;

public class FileDownloadPopUp {

	public static void main(String[] args) throws IOException {
		WebDriver driver = ActitimeUtils.getDriver(GlobalVariables.browser);
		if(GlobalVariables.browser.equals("chrome")) {
			Runtime.getRuntime().exec("D:/synechron_07_12_2020/autoIT/fileUpload.exe");
			
		}
		else
		{
			Runtime.getRuntime().exec("D:/synechron_07_12_2020/autoIT/fileUpload_inFF.exe");
			
		}
		ActitimeUtils.launch(GlobalVariables.formyURL);
		ActitimeUtils.pause(2000);
		ActitimeUtils.click("linktext", "File Upload");
		ActitimeUtils.pause(2000);
		ActitimeUtils.click("id", "file-upload-field");
		
		
	}
}
