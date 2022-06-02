package com.DemoAutomationTesting.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public FileLibrary fileLibrary;
	JavaLibrary javaLibrary;
	public WebDriverLibrary webDriverLibrary;
	long longtimeout;
	public static WebDriver staticdriver;
	@BeforeSuite
	public void beforeSuite()
	{
		fileLibrary=new FileLibrary();
		fileLibrary.openCommanDataFile(ExternalFilePath.COMMONDATA);
		fileLibrary.openTestDataFile(ExternalFilePath.TESTDATA);
	}
	@AfterSuite
	public void afterSuite()
	{
		fileLibrary.openTestDataFileToWrite(ExternalFilePath.TESTDATA);
		fileLibrary.closeTestDataFile();
	}
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser)
	{
		String url=fileLibrary.getCommonData("url");
		String timeout=fileLibrary.getCommonData("timeout");
		javaLibrary=new JavaLibrary();
		longtimeout=javaLibrary.stringToLong(timeout);
		
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;

		default:
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			break;
		}
		staticdriver=driver;
		webDriverLibrary=new WebDriverLibrary();
		webDriverLibrary.launchApplication(driver, url);
		webDriverLibrary.implicitWait(driver, longtimeout);
		webDriverLibrary.maximizeBrowser(driver);
	}
	@AfterClass
	public void afterClass()
	{
		webDriverLibrary.closeBrowse(driver);
	}
	
}
