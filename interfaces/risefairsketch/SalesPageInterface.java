package risefairsketch;

public class SalesPageInterface {
	public static final String BTN_ADDPAYMENT = "//a[@class='btn btn-default mb0'][normalize-space()='Add payment']";
	public static final String TXT_INVOICE = "//label[@for='invoice_id']/following::div[@title='Invoice']";
	public static final String TXT_INVOICE22 = "//div[@id='select2-drop']//li[contains(.,'#22')]";
	public static final String TXT_PAYMENTMETHOD = "//label[normalize-space()='Payment method']//following::div[@class='select2-container select2 selected_payment_method']";
	public static final String TXT_CASH = "//div[@id='select2-drop']//div[contains(.,'Cash')]";
	public static final String TXB_PAYMENTDATE = "//label[normalize-space()='Payment date']/following::input[1]";
	public static final String TXT_20 = "//td[normalize-space()='20']";
	public static final String TXT_25 = "//td[normalize-space()='25']";
	public static final String TXT_30 = "//td[normalize-space()='30']";
	public static final String TXB_AMOUNT = "//label[normalize-space()='Amount']/following::input[1]";
	public static final String TXB_NOTE = "//textarea[@id='invoice_payment_note']";
	public static final String BTN_SAVE = "//button[normalize-space()='Save']";
	public static final String TXB_SEARCH = "//input[@placeholder='Search']";
	public static final String BTN_FIX = "//span[@class='dropdown inline-block']/button[@class='btn btn-default dropdown-toggle caret mt0 mb0']";
	public static final String BTN_DELETE = "//ul[@class='dropdown-menu dropdown-menu-end show']//a[@title='Delete invoice'][normalize-space()='Delete']";

}
