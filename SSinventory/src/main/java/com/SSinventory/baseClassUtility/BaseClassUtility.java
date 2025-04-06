package com.SSinventory.baseClassUtility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import com.SSinventory.fileUtility.JavaFileUtility;
import com.SSinventory.genericUtility.*;

import com.SSinventory.objectRepositotyUtility.*;

 @Listeners(com.SSinventory.ListeneresUtility.ListenerImplementation.class)

public class BaseClassUtility{

	public  WebDriver driver = null;
	public  static WebDriver sdriver = null;
	//Object creation for library
	WebDriverUtility wu = new WebDriverUtility();
	JavaFileUtility jfu = new JavaFileUtility();
	
	 @BeforeSuite
	    public void beforeSuite() {
	        // Perform suite-wide setup actions, if needed
	        System.out.println("Before Suite: Initialize global resources.");
	    }
	
	

	    @BeforeClass

	    public void beforeClass() throws Throwable {

	        System.out.println("BeforeClass: Setup WebDriver");
	        
	        String browser = jfu.getDataFromPropertiesFile("browser");

			if (browser.equals("chrome")) {
				driver = new ChromeDriver();	
			} else if (browser.equals("edge")) {
				driver = new EdgeDriver();
			} else if (browser.equals("firefox")) {
				driver = new FirefoxDriver();
			} else {
				driver = new ChromeDriver();
			}
			
			String url = jfu.getDataFromPropertiesFile("url");
			wu.maximize(driver);
//			
	    }

	    @BeforeMethod
	    public void beforeMethod() throws Throwable {
	        // Open the browser or perform any necessary setup before each test method
	        System.out.println("BeforeMethod: Opening website");
	        wu.waitForPageToLoad(driver, 15);
			LoginPage lp = new LoginPage(driver);
			driver.get(jfu.getDataFromPropertiesFile("url"));
			wu.waitForScriptToLoad(driver, 10);
			wu.waitForElementToLoad(driver, 10);
			lp.getUsername_Edit().sendKeys(jfu.getDataFromPropertiesFile("username"));
			lp.getPassword_Edit().sendKeys(jfu.getDataFromPropertiesFile("password"));
			lp.getLogin_Btn().click();
			wu.acceptAlert(driver);
			
	    }

	    @AfterMethod
	    public void afterMethod() {
	        // Capture logs or perform cleanup actions after each test method
	        System.out.println("AfterMethod: Cleanup after each test method");
	     
	    }

	    @AfterClass
	    public void afterClass() {
         // Close the WebDriver and perform any global cleanup after all tests are finished
	        System.out.println("AfterClass: Cleanup after all tests");
	    	driver.quit();
	    }
	    
	    @AfterSuite
	    public void afterSuite() {
	        // Perform suite-wide cleanup actions
	        System.out.println("After Suite: Clean up global resources.");
	    }
	
	}




