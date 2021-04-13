package org.airlinesite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderIdDetailsPojoClass extends BaseClassAirline {
	public OrderIdDetailsPojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=("//table[@class='table']//tr[1]//td[2]"))
	private WebElement PassengerId;
	public WebElement getPassengerId() {
		return PassengerId;
	}
}
