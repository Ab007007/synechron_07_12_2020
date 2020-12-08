package com.synechron.java.basic.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {

	
	public static void main(String[] args) throws IOException {
		
		File file = new File("data/config.properties");
		FileInputStream fis = new FileInputStream(file);
		
		
		
		Properties props = new Properties();
		props.load(fis);
		
		
		
		System.out.println(getPropertyValue(props, "url"));
		System.out.println(getPropertyValue(props, "username"));
		System.out.println(getPropertyValue(props, "password"));
		System.out.println(getPropertyValue(props, "password12SS"));
		System.out.println(getPropertyValue(props, "timeout"));
		
		
		fis.close();
	}
	
	public static String getPropertyValue(Properties props,String name) {
		String value = null;
		if(props.getProperty(name)!=null) {
			value = props.getProperty(name);
		}
		return value;
	}
}
