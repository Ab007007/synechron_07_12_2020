package com.synechron.actitime.seleniumtraining.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	
	public static Workbook wb = null;
	public static Sheet sh = null;
	public static Row row =null;
	public static Cell cell =null;
	public static final String fileName = "data/actitime-testdata.xls";
	public static FileInputStream fis  = null; 
	public static File file  = null; 
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
		 
		Sheet sh = wb.getSheet("Sheet1");
		System.out.println("Total Row Count : " + (sh.getLastRowNum()+1));
		
		Row row = null;
		Cell cell = null;
		for(int i =0; i<=sh.getLastRowNum() ; i++) {
			row = sh.getRow(i);
			cell = row.getCell(0);
			System.out.println(cell.toString());
			
		}
		fis.close();
	}
	
	public static Workbook getWorkBook() {
		System.out.println("--- creating workbook object---");
		try {
			file = new File(fileName);
			fis = new FileInputStream(file);
			wb = WorkbookFactory.create(fis);
		}catch(Exception ex ) {
			System.out.println("Exception while reading file");
		}
		
		return wb;
	}
	
	public static Sheet getSheet(String name) {
		wb = getWorkBook();
		sh = wb.getSheet(name);
		return sh;
	}
	
	public static String getCellData(String sheetName, int rowNum, int colNum)
	{
		sh = getSheet(sheetName);
		row = sh.getRow(rowNum);
		cell = row.getCell(colNum);
		closeStream();
		return cell.toString();
		
	}
	
	public static int rowCount(String sheetName) 
	{
		sh = getSheet(sheetName);
		int rowCount = sh.getLastRowNum()+1;
		closeStream();
		return rowCount;
	}
	
	public static void closeStream() {
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	

}
