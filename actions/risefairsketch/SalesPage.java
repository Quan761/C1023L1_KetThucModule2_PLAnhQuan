package risefairsketch;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class SalesPage extends AbstractPage {
	WebDriver driver;

	public SalesPage(WebDriver driver_) {
		driver = driver_;
	}

	public void clickAddPayment() {
		clickToElement(driver, SalesPageInterface.BTN_ADDPAYMENT);
	}

	public void clickInvoice() {
		clickToElement(driver, SalesPageInterface.TXT_INVOICE);
	}

	public void clickInvoice22() {
		clickToElement(driver, SalesPageInterface.TXT_INVOICE22);
	}

	public void clickPaymentMethod() {
		clickToElement(driver, SalesPageInterface.TXT_INVOICE);
	}

	public void clickCash() {
		clickToElement(driver, SalesPageInterface.TXT_CASH);
	}

	public void clickPaymentDate() {
		clickToElement(driver, SalesPageInterface.TXB_PAYMENTDATE);
	}

	public void click20() {
		clickToElement(driver, SalesPageInterface.TXT_20);
	}

	public void click25() {
		clickToElement(driver, SalesPageInterface.TXT_25);
	}

	public void click30() {
		clickToElement(driver, SalesPageInterface.TXT_30);
	}

	public void inputAmount() {
		sendkeyToElement(driver, SalesPageInterface.TXB_AMOUNT, "10");
	}

	public void inputNote() {
		sendkeyToElement(driver, SalesPageInterface.TXB_NOTE, "Note");
	}

	public void clickSave() {
		clickToElement(driver, SalesPageInterface.BTN_SAVE);
	}

	public void inputSearch() {
		sendkeyToElement(driver, SalesPageInterface.TXB_SEARCH, "#27");
	}

	public void clickFix() {
		clickToElement(driver, SalesPageInterface.BTN_FIX);
	}

	public void clickDelete() {
		clickToElement(driver, SalesPageInterface.BTN_DELETE);
	}
}
