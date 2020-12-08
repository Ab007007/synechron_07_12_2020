package com.synechron.java.basic.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

public class ReadingFileDemo {
	
	public static void main(String[] args) {
		
		
		File file = new File("data/abc.txt");
		FileInputStream  fis = null;
		try {
			fis = new FileInputStream(file);
			int i = 0;
			
			while((i=fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File not found please check the path");
		}
		catch (IOException e) {
			System.out.println("Write operatioin is not possible ");
		}
		finally {
			try
			{
				fis.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fis = null;
		}
		
		
	}

}
