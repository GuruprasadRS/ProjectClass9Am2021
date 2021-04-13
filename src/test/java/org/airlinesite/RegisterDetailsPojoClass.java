package org.airlinesite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterDetailsPojoClass extends BaseClassAirline {
	public RegisterDetailsPojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("(//input[@id='inputName'])[1]"))
	private WebElement Name;
	@FindBy(xpath = ("(//input[@id='address'])[1]"))
	private WebElement Address;
	@FindBy(xpath = ("(//input[@id='city'])[1]"))
	private WebElement City;
	@FindBy(xpath = ("(//input[@id='state'])[1]"))
	private WebElement State;
	@FindBy(xpath = ("(//input[@id='zipCode'])[1]"))
	private WebElement ZipCode;
	@FindBy(xpath = ("(//select[@id='cardType'])[1]"))
	private WebElement CardType;
	
	@FindBy(xpath = ("(//input[@id='creditCardNumber'])[1]"))
	private WebElement CreditCardNumber;
	@FindBy(xpath = ("(//input[@id='creditCardMonth'])[1]"))
	private WebElement Month;
	@FindBy(xpath = ("(//input[@id='creditCardYear'])[1]"))
	private WebElement Year;
	@FindBy(xpath = ("(//input[@id='nameOnCard'])[1]"))
	private WebElement NameOnCard;
	
	@FindBy(xpath = ("(//input[@id='rememberMe'])[1]"))
	private WebElement RememberMe;
	@FindBy(xpath = ("(//input[@type='submit'])[1]"))
	private WebElement PurchaseFlights;
	public WebElement getName() {
		return Name;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCity() {
		return City;
	}
	public WebElement getState() {
		return State;
	}
	public WebElement getZipCode() {
		return ZipCode;
	}
	public WebElement getCardType() {
		return CardType;
	}
	public WebElement getCreditCardNumber() {
		return CreditCardNumber;
	}
	public WebElement getMonth() {
		return Month;
	}
	public WebElement getYear() {
		return Year;
	}
	public WebElement getNameOnCard() {
		return NameOnCard;
	}
	public WebElement getRememberMe() {
		return RememberMe;
	}
	public WebElement getPurchaseFlights() {
		return PurchaseFlights;
	}
}
