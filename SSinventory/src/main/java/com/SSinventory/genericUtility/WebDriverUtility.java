package com.SSinventory.genericUtility;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility {

	// switch to alert
		public void switchToAlertAndAccept(WebDriver driver) {
			driver.switchTo().alert().accept();
		}

		public void switchToAlertAndDismiss(WebDriver driver) {
			driver.switchTo().alert().dismiss();
		}

}
