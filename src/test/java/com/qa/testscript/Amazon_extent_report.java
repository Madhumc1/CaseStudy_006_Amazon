/*
 * package com.qa.testscript;
 * 
 * import java.util.List;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.ui.Select; import org.testng.ITestResult; import
 * org.testng.Reporter; import org.testng.annotations.AfterMethod; import
 * org.testng.annotations.AfterTest; import org.testng.annotations.BeforeMethod;
 * import org.testng.annotations.BeforeTest; import org.testng.annotations.Test;
 * 
 * import com.aventstack.extentreports.ExtentReports; import
 * com.aventstack.extentreports.ExtentTest; import
 * com.aventstack.extentreports.Status; import
 * com.aventstack.extentreports.reporter.ExtentSparkReporter; import
 * com.aventstack.extentreports.reporter.configuration.Theme;
 * 
 * @Test public class Amazon_extent_report{
 * 
 * 
 * public WebDriver Driver; public ExtentSparkReporter htmlReporter; public
 * ExtentReports XReports; public ExtentTest XTest;
 * 
 * 
 * @BeforeTest public void startreport() { htmlReporter = new
 * ExtentSparkReporter(System.getProperty("user.dir")
 * +"\\test-output\\MyHTMLReport.html");
 * htmlReporter.config().setDocumentTitle("Test Automation Report");
 * htmlReporter.config().setReportName("Functional Testing");
 * htmlReporter.config().setTheme(Theme.DARK);
 * 
 * XReports = new ExtentReports(); XReports.attachReporter(htmlReporter);
 * XReports.setSystemInfo("HostName", "LocalHost"); XReports.setSystemInfo("OS",
 * "Windows"); XReports.setSystemInfo("Browser", "Chrome");
 * 
 * }
 * 
 * @AfterTest
 * 
 * public void EndReport() { Driver.quit(); XReports.flush();
 * 
 * }
 * 
 * @BeforeMethod
 * 
 * public void setUp() { System.setProperty("WebDriver.chrome.driver",
 * "D:\\Users\\cse\\Downloads\\chromedriver_win32\\chromedriver.exe"); Driver =
 * new ChromeDriver(); Driver.get("https://www.amazon.in/");
 * Driver.manage().window().maximize();
 * 
 * }
 * 
 * @AfterMethod public void teardown(ITestResult results) { if
 * (results.getStatus() == ITestResult.FAILURE) { XTest.log(Status.FAIL,
 * "The test failed is:" + results.getName()); XTest.log(Status.FAIL,
 * "The test failed is:" + results.getThrowable()); } else if
 * (results.getStatus() == ITestResult.SUCCESS) { XTest.log(Status.PASS,
 * "The test Passed is:" + results.getName()); } else if (results.getStatus() ==
 * ITestResult.SKIP) { XTest.log(Status.SKIP, "The test Passed is:" +
 * results.getName());
 * 
 * } }
 * 
 * 
 * public void Search_Item() {
 * 
 * XTest = XReports.createTest("Search_Item");
 * 
 * Select Category = new Select(Driver.findElement(By.id("searchDropdownBox")));
 * Category.selectByVisibleText("Books");
 * 
 * Driver.findElement(By.name("field-Keywords")).sendKeys("Da vinci code");
 * Driver.findElement(By.xpath("//input[@tabindex ='10']")).click();
 * 
 * List<WebElement> All_Titles = (List<WebElement>) Driver.findElements(By.
 * xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
 * 
 * System.out.println("Total no of items loaded are:" + All_Titles.size());
 * 
 * for (WebElement titles : All_Titles) {
 * Reporter.log(((org.openqa.selenium.WebElement) titles).getText());
 * 
 * 
 * }
 * 
 * } }
 * 
 * 
 */