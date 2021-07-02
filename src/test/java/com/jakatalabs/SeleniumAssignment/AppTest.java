package com.jakatalabs.SeleniumAssignment;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.jakatalabs.SeleniumAssignment.pages.BasePage;
import com.jakatalabs.SeleniumAssignment.pages.CommonWebPage;
import com.jakatalabs.SeleniumAssignment.pages.HomePage;
import com.jakatalabs.SeleniumAssignment.pages.LoginPage;
import com.jakatalabs.SeleniumAssignment.pages.ProfilePage;

public class AppTest extends BaseWebTest {

	HomePage homePage = new HomePage(driver, explicitWait);
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProfilePage profilePage = new ProfilePage(driver, explicitWait);
	CommonWebPage commonWebPage = new CommonWebPage(driver, explicitWait);

	@Test
	public void LoginTest() {

		String username = "jogidemo321@gmail.com";
		String password = "builder123";

		homePage.clickOnMenuItem(AppEnums.MenuNames.LOGIN.toString());
		BasePage.clickAndWait(By.xpath("//*[@class='closeButton']//*[@class='icon-cancel']"));
		BasePage.clickAndWait(By.xpath("//*[@class='natashaMsgPanel']"));
		BasePage.clickAndWait(By.xpath("//div[@class='closePanel']//em[@class='icon-cancel']"));
		BasePage.clickAndWait(By.xpath("//button[normalize-space()='Sign In']"));
		HomePage.clickOnButton(AppEnums.ButtonNames.signIn.toString());
		loginPage.login(username, password);

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		BasePage.clickAndWait(By.xpath("//app-home-template-card[1]//div[1]//div[1]//div[2]//button[1]//em[1]"));
		BasePage.clickAndWait(By.xpath("//div[@class='getStart']"));

		explicitWait.get()
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='wizardDot']//span[1]")));
		explicitWait.get().until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[normalize-space()='Will you need audio management features?']")));

		BasePage.clickAndWait(By.xpath("//button[normalize-space()='Plan Delivery']"));

		BasePage.clickAndWait(By.xpath("//button[normalize-space()='Done']"));

		String projectName = "SeleniumAssignment - Aldi";
		BasePage.setText(By.xpath("//input[@placeholder='eg. Booking.com']"), projectName);
		BasePage.clickAndWait(By.xpath("//button[normalize-space()='Save']"));

		HomePage.clickOnDiv(AppEnums.MenuNames.userProfile.toString());
		BasePage.clickAndWait(By.xpath("//span[normalize-space()='Dashboard']"));

		String verifyProjectName = BasePage.getText(By.xpath("//p[@class='strip-head']"));
		assertEquals(verifyProjectName, projectName);

		String totalCost = BasePage.getText(By.xpath("//p[@class='ng-star-inserted']//strong[contains(text(),'₹')]"));

		String verifyProjectNameOnDashboard = BasePage.getText(By.xpath(
				"/html/body/app/div/div[1]/div[2]/main/app-dashboard/div/div[2]/div/app-dashboard-main/div/div/div[3]/app-completed-cards/div[2]/div[1]/div[1]/div[1]"));
		assertEquals(verifyProjectNameOnDashboard, projectName + "\nLast edited: less than a minute ago");

		String verifyTotalCost = BasePage.getText(By.xpath(
				"/html/body/app/div/div[1]/div[2]/main/app-dashboard/div/div[2]/div/app-dashboard-main/div/div/div[3]/app-completed-cards/div[2]/div[1]/div[3]/div[1]/div"));
		assertEquals(verifyTotalCost, totalCost.replaceAll(" ", ""));
	}

}