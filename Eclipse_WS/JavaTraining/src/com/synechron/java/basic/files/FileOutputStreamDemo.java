package com.synechron.java.basic.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	
	public static void main(String[] args) throws IOException {
		
		File file = new File("data/abc.txt");
		FileOutputStream fos = new FileOutputStream(file, true);
		
		fos.write("\nJava is writitng into the file".getBytes());
		fos.close();
		fos = null;
		
	}
}
