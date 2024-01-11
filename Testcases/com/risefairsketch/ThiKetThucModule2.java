package com.risefairsketch;

import java.util.Spliterator;

import org.jboss.netty.handler.codec.spdy.SpdyWindowUpdateFrame;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import risefairsketch.HomePage;
import risefairsketch.LoginPage;
import risefairsketch.SalesPage;

public class ThiKetThucModule2 extends AbstractTest {
	WebDriver driver;

	@Parameters({ "browser" })
	@BeforeTest
	public void beforeTest(String browser) {
		driver = openMultiBrowsers(browser);
	}

	@Test
	public void TC01_Create03Payment() {
		loginPage = new LoginPage(driver);

		System.out.println("Step 01 - Login to application");
		loginPage.openLoginPage("https://rise.fairsketch.com/");
		loginPage.loginWithEmailAndPassword();

		homePage = new HomePage(driver);
		System.out.println("VP - Verify Login successfully");
		homePage.verifyHomePageIsDisplayed();

		System.out.println("Step 02 - Click Sales > Invoices");
		homePage.clickSales();
		homePage.clickInvoices();

		salesPage = new SalesPage(driver);

		System.out.println("Step 03 - Create first payment");

		System.out.println("Add Payment");
		salesPage.clickAddPayment();

		System.out.println("Choose Invoice #22");
		salesPage.clickInvoice();
		salesPage.clickInvoice22();

		System.out.println("Choose Cash");
		salesPage.clickPaymentMethod();
		salesPage.clickCash();

		System.out.println("Choose 20 in [Payment Date]");
		salesPage.clickPaymentDate();
		salesPage.click20();

		System.out.println("Input Amount");
		salesPage.inputAmount();

		System.out.println("Input Note");
		salesPage.inputNote();

		System.out.println("CLick [Save]");
		salesPage.clickSave();

		System.out.println("Step 04 - Create first payment");
		System.out.println("Add Payment");
		salesPage.clickAddPayment();

		System.out.println("Choose Invoice #22");
		salesPage.clickInvoice();
		salesPage.clickInvoice22();

		System.out.println("Choose Cash");
		salesPage.clickPaymentMethod();
		salesPage.clickCash();

		System.out.println("Choose 25 in [Payment Date]");
		salesPage.clickPaymentDate();
		salesPage.click25();

		System.out.println("Input Amount");
		salesPage.inputAmount();

		System.out.println("Input Note");
		salesPage.inputNote();

		System.out.println("CLick [Save]");
		salesPage.clickSave();

		System.out.println("Step 05 - Create thirst payment");
		System.out.println("Add Payment");
		salesPage.clickAddPayment();

		System.out.println("Choose Invoice #22");
		salesPage.clickInvoice();
		salesPage.clickInvoice22();

		System.out.println("Choose Cash");
		salesPage.clickPaymentMethod();
		salesPage.clickCash();

		System.out.println("Choose 30 in [Payment Date]");
		salesPage.clickPaymentDate();
		salesPage.click30();

		System.out.println("Input Amount");
		salesPage.inputAmount();

		System.out.println("Input Note");
		salesPage.inputNote();

		System.out.println("CLick [Save]");
		salesPage.clickSave();
	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}

	private LoginPage loginPage;
	private HomePage homePage;
	private SalesPage salesPage;

}
