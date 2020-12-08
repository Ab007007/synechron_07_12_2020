package com.synechron.java.basic.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingWriterDemo {

	
	public static void main(String[] args) throws IOException {
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			 file = new File("data/abc1.txt");
			 if(!file.exists()) {
					file.createNewFile();
				}
			 fw = new FileWriter(file, true);
			 bw = new BufferedWriter(fw);
			 bw.newLine();
			 bw.write("Buffered writer is just easy to use than any other!!!");
			
		}
		catch(IOException ex) {
			System.out.println(" Problem in writing to the file!!!");
		}
		finally {
			 bw.close();
			 fw.close();
		}
	}
}
