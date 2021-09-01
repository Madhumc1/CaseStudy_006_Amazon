//package com.qa.utility;
//
//import java.io.FileInputStream;
//
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class Exceldataprovider {
//	
//	
//
//	public static XSSFWorkbook wBook;
//	public static XSSFSheet wSheet;
//	public static XSSFRow row;
//	public static XSSFCell cell;
//	
//    public static String[][] getExcelData(String fileName , String sheetName) {
//	
//
//	// This method handles the excel - opens it and reads the data from the
//	// respective cells
//	// using a for-loop & returns it in the form of a string array
//
//	String[][] data = null;
//
//	try
//
//	{
//
//		fileLoc = new FileInputStream(fileName);
//
//		wBook = new XSSFWorkbook(fileLoc);
//
//		wSheet = wBook.getSheet(sheetName);
//
//		row = wSheet.getRow(0);
//
//		int noOfRows = wSheet.getPhysicalNumberOfRows();
//
//		int noOfCols = row.getLastCellNum();
//
//		data = new String[noOfRows - 1][noOfCols];
//
//		for (int i = 1; i < noOfRows; i++) {
//
//			for (int j = 0; j < noOfCols; j++) {
//
//				row = wSheet.getRow(i);
//
//				cell = row.getCell(j);
//
//				data[i - 1][j] = cell.getStringCellValue();
//
//			}
//
//		}
//
//	}
//
//	catch(Exception e)
//	{
//
//		System.out.println("The exception is: " + e.getMessage());
//
//	}
//
//	return data;
//	}
//
//    
//}
//
//
