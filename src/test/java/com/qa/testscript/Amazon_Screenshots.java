package com.qa.testscript;



import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.codec.language.bm.Rule;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class Amazon_Screenshots  {
	 public  WebDriver driver;
		
	   @BeforeClass 
	    public void initilalization() {
	    	   //Opening browser
	    	
	    		System.setProperty("webdriver.chrome.driver", "D:\\Users\\cse\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    	    driver = new ChromeDriver();
	    	    driver.get("https://www.amazon.in/");
	    	    driver.manage().window().maximize();	
	    	    
	    }
	   
	   @AfterClass
	    public void tearDown() {
	    	//close browser
	    	driver.close();
	    }
	   
	   @Test
	public void screenshotOfElement() throws IOException {
		  File Source =  driver.findElement(By.id("nav-logo-sprites")).getScreenshotAs(OutputType.FILE);
		  String Dest = System.getProperty("user.dir")+"/Screenshots/"+"AmazonLogo.png";
		  com.google.common.io.Files.copy(Source,new File(Dest));
		  
	   }
	   @Test
	public void screenshotOfDriver() throws IOException {
		   
		   TakesScreenshot screenshot = (TakesScreenshot) driver;
		   File Source = screenshot.getScreenshotAs(OutputType.FILE);
		   String Dest = System.getProperty("user.dir")+"/Screenshots/"+"Amazon_Pages.png";
		   com.google.common.io.Files.copy(Source,new File(Dest));
	   }
	   
	   @Test
	public void screenshotOfFullPage() throws IOException {
		  AShot SShot = new AShot();
		   ru.yandex.qatools.ashot.Screenshot Source = SShot.shootingStrategy(ShootingStrategies.viewportPasting(300)).takeScreenshot(driver);
		   String Dest = System.getProperty("user.dir")+"/Screenshots/"+"AmazonFullPage.jpg";
		   ImageIO.write(Source.getImage(),"jpg", new File(Dest));
}
	 
}



