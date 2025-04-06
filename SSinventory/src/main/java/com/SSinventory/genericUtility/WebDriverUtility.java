package com.SSinventory.genericUtility;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	//=================================================================close BROWSER and quite SERVER=============================================================================  
		public void closeBrowser(WebDriver driver) {
			driver.close();
			
		}
	    public void quiteServer(WebDriver driver) {
	    	driver.quit();
	 
		}
	//=================================================================MAXIMIZE AND MINIMIZE OF BROWSER =============================================================================
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void minimize(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	//================================================================= ACCEPT AND DISSMISS ALERT =============================================================================
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}

	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	
	public void waitForAlert(WebDriver driver) {
	// ... your WebDriver instance ...
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // Wait up to 10 seconds.
	try {
	    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	    // Now you can interact with the alert:
	    alert.accept(); // Or alert.dismiss(), alert.getText(), alert.sendKeys()
	} catch (NoAlertPresentException e) {
	    System.out.println("Alert was not present.");
	}
	}
	
	
	//=================================================================Scrolling action=============================================================================  
	public void ScrollToBottom(WebDriver driver) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollTo(0, 0)");
		
	}
	
    public void ScrollToTop (WebDriver driver) {
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollTo(0, 0)");
		
	}

    public void ScrollToElement(WebDriver driver,WebElement element) {
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	 js.executeScript("arguments[0].scrollIntoView(true);", element); //or false, if you want the bottom of the element to be visible
	
    }
	
	
	//================================================================= WAITING STATEMENTS ============================================================================
	public void waitForPageToLoad(WebDriver driver,int time) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	public void waitForScriptToLoad(WebDriver driver,int time) {
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
	}
	
	
	public void waitForElementToLoad(WebDriver driver,int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public void waitForElementPresent(WebDriver driver,int time,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
			
		}
	
	//================================================================= NAVIGATION >>>FORWARD,  BACKWORD<<< ============================================================================
	
	public void navigationForward(WebDriver driver) {
		driver.navigate().forward();
			
		}
	public void navigationBack(WebDriver driver) {
		driver.navigate().back();
			
		}
	
	
	//================================================================= ============================================================================
	
	/* window handles */
	public void getWindowHandles(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for (String win : child) {
			driver.switchTo().window(win);
		}
	}
	
	
	//================================================================= for taking screenshot ============================================================================
	
	/* TakesScreenShot */
	public void getTakesScreenshot(WebDriver driver)  {
		
//		TakesScreenshot tss = (TakesScreenshot)driver;
//		File src = tss.getScreenshotAs(OutputType.FILE);
//		File dest = new File("E:\\D-GIT_GITHUB\\SalesAndInventorySystem\\SSinventory\\screenshot\\report10.png");
//		src.renameTo(dest);
		
		
		
	}

	//================================================================= Select DropDowns ============================================================================
	public void selectByText(WebElement element, String text) {
		Select sel = new Select (element);
		sel.selectByVisibleText(text);
	}

	public void selectByIndex(WebElement element, int index) {
		Select sel = new Select (element);
		sel.deselectByIndex(index);
	}
	
	
	//================================================================= WAITING STATEMENTS ============================================================================
	// Setting the value of an input field
	public void executeJavascript(WebDriver driver, WebElement element,String script) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(script, element);
	}
    
	//================================================================= WAITING STATEMENTS ============================================================================
	//================================================================= WAITING STATEMENTS ============================================================================

}
