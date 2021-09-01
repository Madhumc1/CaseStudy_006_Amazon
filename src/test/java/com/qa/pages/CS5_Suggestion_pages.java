package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CS5_Suggestion_pages {
	
	WebDriver driver;

	public CS5_Suggestion_pages(WebDriver driver) {
		
		this.driver = driver;
        PageFactory.initElements(driver,this);

	}
	
	

	@FindBy(name = "q")
	org.openqa.selenium.WebElement Searchbox;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/ul")
	List<WebElement> suggestedNames;


	
	@FindBy(xpath ="//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")
	org.openqa.selenium.WebElement magnifier;
	

	public WebElement getSearchbox() {
		
		return Searchbox;
	}

	public WebElement getMagnifier() {
		// TODO Auto-generated method stub
		return magnifier;
	}

	public List<WebElement> getSuggestedNames() {
		// TODO Auto-generated method stub
		return suggestedNames;
	}

}
