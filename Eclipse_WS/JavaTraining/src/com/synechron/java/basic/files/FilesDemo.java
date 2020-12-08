package com.synechron.java.basic.files;

import java.io.File;
import java.io.IOException;

public class FilesDemo {

	
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\");
		
		System.out.println("getAbsolutePath - " + file.getAbsolutePath());
		System.out.println("getCanonicalPath - " +file.getCanonicalPath());
		System.out.println("canExecute - " +file.canExecute());
		System.out.println("canWrite - " +file.canWrite());
		System.out.println("canRead - " +file.canRead());
		System.out.println("is file - " + file.isFile());
		System.out.println("is dir - " + file.isDirectory());
		
		String[] files = file.list();
		for (String filename : files) {
			System.out.println(filename);
			
		}
		
		File[] folderAndFiles = file.listFiles();
		
		for (File fAndF : folderAndFiles) {
			if(fAndF.isDirectory()) {
				System.out.println("[ FOLDER ] : " + fAndF.getName());
			}
			System.out.println(fAndF.getName());
			
		}
		
		
		
		
		
	}
}
