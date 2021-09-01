package com.qa.utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static FileInputStream fileLoc;
	public static XSSFWorkbook wBook;
	public static XSSFSheet wSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	
	// get the row count
	
	public static int getRowcount(String xFile, String xsheet) throws IOException {
		
		fileLoc = new FileInputStream(xFile);
		 wBook = new XSSFWorkbook(fileLoc);
		 wSheet = wBook.getSheet(xsheet);
		 int rowCount =wSheet.getLastRowNum();
		 wBook.close();
		 fileLoc.close();
		 return rowCount;
	}
	
	// get the cell count of each row
	
	public static int getCellCount(String xFile, String xsheet, int rowNum) throws IOException
	{
		fileLoc = new FileInputStream(xFile);
		 wBook = new XSSFWorkbook(fileLoc);
		 wSheet = wBook.getSheet(xsheet);
		 
		 row = wSheet.getRow(rowNum);
		 int cellCount= row.getLastCellNum();
		 wBook.close();
		 fileLoc.close();
		 
		return cellCount;
		
	}
	
	// Read the data from each cell and return in string
	
	public static String getCellCount(String xFile, String xSheet, int rowNum , int collNum) throws IOException
	{
		fileLoc = new FileInputStream(xFile);
		 wBook = new XSSFWorkbook(fileLoc);
		 wSheet = wBook.getSheet(xSheet);
		 
		 row = wSheet.getRow(rowNum);
		 cell = row.getCell(collNum);
		 
		 DataFormatter formatter = new DataFormatter();
		 String cellData = formatter.formatCellValue(cell);
		 
		 wBook.close();
		 fileLoc.close();
	
		 return cellData;
	}

	public static String getcellData(String xFile, String xsheet, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	 
	
	


}
