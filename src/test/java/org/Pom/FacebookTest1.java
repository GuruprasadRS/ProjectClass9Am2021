package org.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FacebookTest1 extends BaseClass{
	//[findby,findbys,findall,cachelookup]
	public FacebookTest1() {
	PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBys({
		@FindBy(id="email"),
		@FindBy(xpath="//input[@id='email']")
		})
	private WebElement txtemail;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="pass"),
		@FindBy(xpath="//input[@id='pass']")
		})
	private WebElement txtpass;
	
	@FindBy(name="login")
	private WebElement btnlogin;

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
}
