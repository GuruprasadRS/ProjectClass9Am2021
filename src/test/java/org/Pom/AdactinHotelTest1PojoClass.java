package org.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelTest1PojoClass extends BaseClass{

	public AdactinHotelTest1PojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//input[@id='username']"))
	private WebElement username;
	@FindBy(xpath=("//input[@id='password']"))
	private WebElement password;
	@FindBy(xpath=("//input[@id='login']"))
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
}