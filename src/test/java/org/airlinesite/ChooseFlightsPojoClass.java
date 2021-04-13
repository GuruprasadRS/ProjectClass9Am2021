package org.airlinesite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseFlightsPojoClass extends BaseClassAirline{
	public ChooseFlightsPojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = ("(//input[@class='btn btn-small'])[3]"))
	private WebElement chooseFlight;
	
	public WebElement getChooseFlight() {
		return chooseFlight;
	}

}
