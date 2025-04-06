package com.SSinventory.baseClassUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.SSinventory.fileUtility.JavaFileUtility;
import com.SSinventory.genericUtility.WebDriverUtility;
import com.SSinventory.objectRepositotyUtility.LoginPage;
@Listeners(com.SSinventory.ListeneresUtility.ListenerImplementation.class)

public class BaseClassUserPanel {
	public  WebDriver driver = null;
	public  static WebDriver sdriver = null;
	//Object creation for library
	WebDriverUtility wu = new WebDriverUtility();
	JavaFileUtility jfu = new JavaFileUtility();
	
	String url = "http://49.249.28.218:8081/AppServer/Sales_And_Inventory_System/pages/login.php";
	
	 @BeforeSuite
	    public void beforeSuite() {
	        // Perform suite-wide setup actions, if needed
	        System.out.println("Before Suite: Initialize global resources.");
	    }
	
	

	    @BeforeClass

	    public void beforeClass() throws Throwable {
	    	
	        System.out.println("BeforeClass: Setup WebDriver");
	        driver = new ChromeDriver();
	        wu.maximize(driver);
	        wu.waitForPageToLoad(driver, 10);
	        
	       
		   
			
	    }

	    @BeforeMethod
	    public void beforeMethod() throws Throwable {
	        // Open the browser or perform any necessary setup before each test method
	        System.out.println("BeforeMethod: Opening website");
	        LoginPage lp = new LoginPage(driver);
	        driver.get(url);
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
