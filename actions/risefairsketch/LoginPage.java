package risefairsketch;

import org.openqa.selenium.WebDriver;

import risefairsketch.LoginPageInterfaces;
import commons.AbstractPage;

public class LoginPage extends AbstractPage {
	WebDriver driver;

	public LoginPage(WebDriver driver_) {
		driver = driver_;
	}

	public void openLoginPage(String url) {
		openUrl(driver, url);
	}

	public void loginWithEmailAndPassword() {
		clearText(driver, LoginPageInterfaces.TXB_EMAIL);
		sendkeyToElement(driver, LoginPageInterfaces.TXB_EMAIL, "admin@demo.com");
		clearText(driver, LoginPageInterfaces.TXB_PASSWORD);
		sendkeyToElement(driver, LoginPageInterfaces.TXB_PASSWORD, "riseDemo");
		clickToElement(driver, LoginPageInterfaces.BTN_SIGNIN);
	}
}
