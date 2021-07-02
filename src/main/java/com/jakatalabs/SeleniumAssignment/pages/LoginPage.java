package com.jakatalabs.SeleniumAssignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	By username = By.xpath("//input[@id='loginEmailInput']");
	By password = By.xpath("//input[@placeholder='Enter password']");
	By loginBtn = By.xpath("//button[normalize-space()='Sign in']");

	public void login(String user, String pwd) {

		setText(username, user);
		setText(password, pwd);
		clickAndWait(loginBtn);

	}
}
