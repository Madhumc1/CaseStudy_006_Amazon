package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Pages {
	
	
	WebDriver driver;

	Amazon_Pages Amazon;

		@FindBy(id="searchDropdownBox") WebElement Category;

		public Select getCategory() {
			Select Cat= new Select(Category);
			return Cat;
		}

		@FindBy(id ="twotabsearchtextbox")WebElement SearchTextBox;
		
		public WebElement getSearchTextBox() {
		return SearchTextBox;
		}
		
		@FindBy(id="nav-search-submit-button")WebElement Magnifier; 
		
		public WebElement getMagnifier() {
			return Magnifier;
		}

		@FindAll(@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']"))
		List<WebElement> ItemNames;

		public List<WebElement> getItemNames(){
			return ItemNames;
		}
		



		public Amazon_Pages(WebDriver driver) {
			this.driver=driver;
		}



		public void SearchItem(String string, String string2) {
			// TODO Auto-generated method stub
			
		}


	/*	public void  SearchItem(String CATEGORY, String SEARCHTEXTBOX) {

			Category.sendKeys(CATEGORY);
			SearchTextBox.sendKeys(SEARCHTEXTBOX);
			Magnifier.click();
			SearchTextBox.clear();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/

}

	
	

