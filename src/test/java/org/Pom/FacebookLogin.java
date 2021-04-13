package org.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin extends BaseClass{
	public FacebookLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement textemail;
	
	@FindBy(id="pass")
	private WebElement textpass;
	
	@FindBy(name="login")
	private WebElement textlogin;

	public WebElement getTextemail() {
		return textemail;
	}

	public WebElement getTextpass() {
		return textpass;
	}

	public WebElement getTextlogin() {
		return textlogin;
	}
}
