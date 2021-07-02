package com.jakatalabs.SeleniumAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonWebPage extends BasePage {

	public CommonWebPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public final String getCurrentUrlFromWebPage() {

		return getCurrentUrl();
	}

}
