package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase {
	
	static WebDriver driver;

		public static WebDriver startBrowser(String browserName,String Url) {

			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\Users\\cse\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver", "D:\\Users\\cse\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.get(Url);
			

			return driver;
		}
		
	@AfterClass	
	public void tearDown() {
		driver.close();
	}

}
