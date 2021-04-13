package org.airlinesite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterCityPojoClass extends BaseClassAirline{
	public RegisterCityPojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = ("(//select[@class='form-inline'])[1]"))
	private WebElement departureCity;
	@FindBy(xpath=("(//select[@class='form-inline'])[2]"))
	private WebElement destinationCity;
	@FindBy(xpath=("(//input[@class='btn btn-primary'])[1]"))
	private WebElement findFlights;
	public WebElement getDepartureCity() {
		return departureCity;
	}
	public WebElement getDestinationCity() {
		return destinationCity;
	}
	public WebElement getFindFlights() {
		return findFlights;
	}

}
