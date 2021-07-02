package com.jakatalabs.SeleniumAssignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	String chooseBase = "//button[normalize-space()='Choose a base'] ";
	static String closeIconCancelButton = "//div[@class='closeButton']//em[@class='icon-cancel']";
	String closeNatashaMsgPanel = "//*[@class='natashaMsgPanel']";
	String closeIconCancelPanel = "//div[@class='closePanel']//em[@class='icon-cancel']";
	String SignIn = "//button[normalize-space()='Sign in']";

	public void clickOnMenuItem(String menuName) {

		By finalXpath = By.xpath(String.format(chooseBase, menuName));
		clickAndWait(finalXpath);

	}

	public static void clickOnIconCancelButton(String buttonCancel) {
		By finalXpath = By.xpath(String.format(closeIconCancelButton, buttonCancel));
		clickAndWait(finalXpath);

	}

	public static void clickOnButton(String string) {
		// TODO Auto-generated method stub

	}

	public static void clickOnDiv(String string) {
		// TODO Auto-generated method stub

	}

	public static void clickOnButton11(String string) {
		// TODO Auto-generated method stub

	}

	public static void clickOnButton1(String string) {
		// TODO Auto-generated method stub

	}

	public static void clickOnDiv1(String string) {
		// TODO Auto-generated method stub

	}

	public static void clickOnButton111(String string) {
		// TODO Auto-generated method stub

	}

	public static void clickOnMenuItem(By xpath) {
		// TODO Auto-generated method stub

	}
}