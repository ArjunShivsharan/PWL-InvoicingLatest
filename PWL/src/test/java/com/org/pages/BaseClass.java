package com.org.pages;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.org.utility.BrowserFactory;
import com.org.utility.ConfigDataProvider;
import com.org.utility.Helper;

public class BaseClass 
{
  public WebDriver driver;
  public ConfigDataProvider config;

  
  @BeforeSuite
  public void setUpSuite() 
  {
	  config = new ConfigDataProvider();
	 	
  }
  
  @BeforeClass
  public void setUp() 
  {
	  driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getStagingURL());
  }
  
 
  @AfterClass
  public void tearDown()  
  {
	 
	    BrowserFactory.quitBrowser(driver);
  }
  
}

