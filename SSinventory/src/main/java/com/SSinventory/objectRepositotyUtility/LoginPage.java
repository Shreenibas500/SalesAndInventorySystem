package com.SSinventory.objectRepositotyUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@name='user']")
	private WebElement username_Edit;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password_Edit;

	@FindBy(xpath = "//button[@name='btnlogin']")
	private WebElement login_Btn;


	WebDriver driver=null;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	public void loginToApp(String username, String paswword) {
		username_Edit.sendKeys(username);
		password_Edit.sendKeys(paswword);
		login_Btn.click();
	}	
}
