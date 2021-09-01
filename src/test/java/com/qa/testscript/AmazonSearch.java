package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.pages.Amazon_Pages;

public class AmazonSearch {
	
	@Test
	public void Search() {
		WebDriver driver = TestBase.startBrowser("chrome","https://www.amazon.in/");
		Amazon_Pages Amazon  = PageFactory.initElements(driver, Amazon_Pages.class);
		Amazon.SearchItem("Books", "Da vinci code");

		Amazon.SearchItem("Electronics", "Mobile Phones");

		Amazon.SearchItem("Dress", "Kurta");
	}	

}
