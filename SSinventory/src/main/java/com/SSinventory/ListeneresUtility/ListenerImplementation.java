package com.SSinventory.ListeneresUtility;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.SSinventory.baseClassUtility.BaseClassUtility;
import com.SSinventory.genericUtility.JavaUtility;
import com.SSinventory.genericUtility.WebDriverUtility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenerImplementation implements   ISuiteListener,ITestListener {
	
	WebDriverUtility wu = new WebDriverUtility();
	JavaUtility ju = new JavaUtility();
	
	 public WebDriver driver;
	 public ExtentReports extent;
	 public ExtentTest test;
	
/*
 onTestStart(ITestResult result): Called when a test method starts.

onTestSuccess(ITestResult result): Called when a test method passes.

onTestFailure(ITestResult result): Called when a test method fails.

onTestSkipped(ITestResult result): Called when a test method is skipped.

onStart(ITestContext context): Called before any test methods are run.

onFinish(ITestContext context): Called after all test methods have been executed.
 */
	
	
/*
onStart(ISuite suite): Called before any test in the suite starts.

onFinish(ISuite suite): Called after all tests in the suite finish.
	 */
/*=============================================ISuiteListener================================================== */
	@Override
    public void onStart(ISuite suite) {
        System.out.println("Suite started: " + suite.getName());
        //for geting suite name for uses
        String SuiteName = suite.getName();
        //for getting Date for uses
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd_MMMM_yyyy_HH_mm_ss");
        String DateTime = now.format(formatter);
        //Extent report extension for advance reporting
        ExtentSparkReporter spark = new ExtentSparkReporter("advanceReport\\_"+SuiteName+DateTime+".html");
        extent = new ExtentReports();
        spark.config().setDocumentTitle("jf");
        spark.config().setReportName("gh");
        extent.attachReporter(spark);
        
      //add ENV information & create test 
        extent.setSystemInfo("OS", "Windows");
        extent.setSystemInfo("BROWSER", "Chrome-100");

    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("Suite finished: " + suite.getName());
            extent.flush();
    }     
	    	  
	    	     
 /*===========================================ITestListener================================================== */
    
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test suite started: " + context.getSuite().getName());
        
        extent.setSystemInfo("Environment", context.getSuite().getName()); //Suite name
        
      
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test suite finished: " + context.getSuite().getName());
       
    }
    
	@Override
    public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getMethod().getMethodName());
        System.out.println("Test started: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getMethod().getMethodName());
        test.log(Status.PASS, "Test passed: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getMethod().getMethodName());
        test.log(Status.FAIL, "Test failed: " + result.getMethod().getMethodName());
        
        String testName = result.getMethod().getMethodName();
        
		System.out.println("method name is"+testName);
		TakesScreenshot ts = (TakesScreenshot)BaseClassUtility.sdriver;
       File temporary1 = ts.getScreenshotAs(OutputType.FILE);
	   File dest1 = new File("E:\\D-GIT_GITHUB\\SalesAndInventorySystem\\SSinventory\\screenshot"+testName+".png");
	   temporary1.renameTo(dest1);
		
	}

	@Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped: " + result.getMethod().getMethodName());
        test.log(Status.SKIP, "Test skipped: " + result.getMethod().getMethodName());
    }

   	    
	     
	    
	   
	    

}
