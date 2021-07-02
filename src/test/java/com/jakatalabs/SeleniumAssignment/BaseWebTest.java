package com.jakatalabs.SeleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseWebTest implements IWebDriver {
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();

	@BeforeMethod
	public void createWebDriver() {

		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
		driver.get().manage().window().maximize();
		driver.get().get("https://staging.engineer.ai/home");
		explicitWait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(240)));
	}

	@AfterMethod
	public void quitWebDriver() {

		driver.get().quit();
		driver.remove();

	}

}
