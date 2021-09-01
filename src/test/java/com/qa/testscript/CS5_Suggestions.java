//package com.qa.testscript;
//
//import java.io.IOException;
//import java.util.List;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.observer.ExtentObserver;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.qa.pages.CS5_Suggestion_pages;
//import com.qa.utility.Exceldataprovider;
//
//public class CS5_Suggestions extends TestBase{
//	
//	public WebDriver Driver;
//	public ExtentSparkReporter htmlReporter;
//	public ExtentReports extent;
//	public ExtentTest XTest;
//	
//	@AfterTest
//    
//	public void EndReport() {
//		Driver.quit();
//		extent.flush();
//
//	}
//
//	@BeforeMethod
//
//	public void setUp() {
//		System.setProperty("WebDriver.chrome.driver","D:\\Users\\cse\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		Driver = new ChromeDriver();
//		Driver.get("https://www.amazon.in/");
//		Driver.manage().window().maximize();
//
//	}
//    
//	
//	@DataProvider(name ="excel-data")
//	
//    public Object[][] getInput() throws IOException{
//
//            //We are creating an object from the excel sheet data by calling a method that reads data from the excel stored locally in our system
//            Object[][] arrObj = Exceldataprovider.getExcelData("D:\\Users\\cse\\eclipse-workspace\\CaseStudy_006_Amazon\\src\\test\\java\\com\\qa\\testscript\\InputofSuggestion","shhet1");
//
//            return arrObj;
//
//    }
//	
//	@Test(dataProvider ="excel-data")
//     // @Parameters("url")
//	public <WebElement> void google(String input) throws InterruptedException {
//		
//	CS5_Suggestion_pages page = new CS5_Suggestion_pages(driver);
//
//	htmlReporter = new ExtentSparkReporter(("user dir")+ "\\test-output \\MyHTMLReport.html");
//	extent.attachReporter(htmlReporter);
//
//	extent.createTest("Launch the google URL");
//	driver.get("https://www.google.co.in");
//
//	extent.createTest("Search for \"Automation Testing\"");
//	page.getSearchbox().sendKeys(input);
//
//	ExtentTest test = extent.createTest("Fetch all the items loaded in the auto suggest field and print");
//	Thread.sleep(5000);
//	
//	List<WebElement> searchItem = (List<WebElement>) page.getSuggestedNames();
//	
//	for (WebElement l : searchItem) {
//		System.out.println(((org.openqa.selenium.WebElement) l).getText());
//	}
//	int count = searchItem.size();
//	if (count > 1) {
//		test.log(Status.PASS, "Atleast 1 item or successfully loaded all the items");
//	}else {
//		test.log(Status.FAIL, "The items are not fetched");
//	}
//	extent.createTest("Click on Search button");
//	page.getMagnifier().submit();
//
//	ExtentTest test1 = extent.createTest("Get the title should be same as search term");
//	if (driver.getTitle().contains("Automation Testing"))
//		test1.log(Status.PASS, "search item and title Both are equal ");
//	else
//		test1.log(Status.PASS, "search item and title Both are nor equal ");
//
//	extent.flush();
//
//}
//
//}
//
//
//
