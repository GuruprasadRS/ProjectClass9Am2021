package org.Pom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelTest4 extends BaseClass {
	public AdactinHotelTest4() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=("//input[@id='first_name']"))
	private WebElement firstName;
	
	@FindBy(xpath=("//input[@id='last_name']"))
	private WebElement lastName;
	
	@FindBy(xpath=("//textarea[@id='address']"))
	private WebElement address;
	

	@FindBy(xpath=("//input[@id='cc_num']"))
	private WebElement ccNumber;

	@FindBy(xpath=("//select[@id='cc_type']"))
	private WebElement cctype;

	@FindBy(xpath=("//select[@id='cc_exp_month']"))
	private WebElement expmonth ;

	@FindBy(xpath=("//select[@id='cc_exp_year']"))
	private WebElement expyear;

	@FindBy(xpath=("//input[@id='cc_cvv']"))
	private WebElement cccvv;

	@FindBy(xpath=("//input[@id='book_now']"))
	private WebElement bookNow;
	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNumber() {
		return ccNumber;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCccvv() {
		return cccvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
}
