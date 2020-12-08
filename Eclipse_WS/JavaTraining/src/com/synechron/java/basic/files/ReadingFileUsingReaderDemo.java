package com.synechron.java.basic.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileUsingReaderDemo {

	
	public static void main(String[] args) throws IOException {
		
		File file = new File("data/abc.txt");
		FileReader reader  = new FileReader(file);
		BufferedReader bReader = new BufferedReader(reader);
		String line =null;
		while((line = bReader.readLine()) != null) {
			System.out.println(line);
		}
		
		bReader.close();
		reader.close();
		
		
	}
}
