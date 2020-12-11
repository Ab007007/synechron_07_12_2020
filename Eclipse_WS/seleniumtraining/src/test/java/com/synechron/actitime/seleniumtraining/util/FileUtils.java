package com.synechron.actitime.seleniumtraining.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {

	public static String getPropertyValue(String name) {
		File file = null;
		FileInputStream fis = null;
		String value = null;
		try {
			file = new File("data/config.properties");
			fis = new FileInputStream(file);
			Properties props = new Properties();
			props.load(fis);
			
			
			if(props.getProperty(name)!=null) {
				value = props.getProperty(name);
			}
		}catch (IOException e) {
			System.out.println("Exception while reading file");
			// TODO: handle exception
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return value;
	}
}
