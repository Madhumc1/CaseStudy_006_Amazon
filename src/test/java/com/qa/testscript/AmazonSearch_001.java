package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.Amazon_Pages;
import com.qa.utility.ExcelUtility;

public class AmazonSearch_001 extends TestBase {
	
	
		WebDriver driver = TestBase.startBrowser("chrome","https://www.amazon.in/");
		Amazon_Pages Amazon = PageFactory.initElements(driver, Amazon_Pages.class);

		@Test(dataProvider="getData")
		public void SearchItem(String Category, String ItemName) {

			Amazon.getCategory().selectByVisibleText(Category);
			Amazon.getSearchTextBox().clear();
			Amazon.getSearchTextBox().sendKeys(ItemName);
			Amazon.getMagnifier().click();

		}

		@DataProvider
		public String[][] getData() throws Exception {


			String xFile ="D:\\Users\\cse\\eclipse-workspace\\CaseStudy_006_Amazon\\src\\test\\java\\com\\qa\\testscript\\InputData.xlsx";
			String xSheet = "Sheet1";

			int rowCount =ExcelUtility.getRowcount(xFile, xSheet);
			int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);

			String[][] data = new String[rowCount][cellCount];

			for(int i=1; i<=rowCount ; i++) {
				for(int j=0; j<cellCount;j++) {
					data[i-1][j] = ExcelUtility.getcellData(xFile, xSheet, i, j);

	 		
				}
			}
			return data;
		}

	}

