package risefairsketch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import risefairsketch.HomePageInterfaces;
import commons.AbstractPage;

public class HomePage extends AbstractPage {
	WebDriver driver;

	public HomePage(WebDriver driver_) {
		driver = driver_;
	}

	public void verifyHomePageIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.xpath(HomePageInterfaces.TXT_USERNAME)).isDisplayed());
	}

	public void clickSales() {
		clickToElement(driver, HomePageInterfaces.TXT_SALES);
	}

	public void clickInvoices() {
		clickToElement(driver, HomePageInterfaces.TXT_INVOICES);
	}
}
