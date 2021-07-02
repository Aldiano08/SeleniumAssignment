package com.jakatalabs.SeleniumAssignment;

import org.openqa.selenium.WebDriver;

public interface IWebDriver {

	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	public void createWebDriver();

	public void quitWebDriver();

}
