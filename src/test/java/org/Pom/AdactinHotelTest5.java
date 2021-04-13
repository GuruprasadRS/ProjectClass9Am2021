package org.Pom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelTest5 extends BaseClass {
	public AdactinHotelTest5() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=("//input[@id='my_itinerary']"))
	private WebElement itinerary;
	
	@FindBy(xpath=("(//input[@type='checkbox'])[2]"))
	private WebElement checkbox;
	
	@FindBy(xpath=("//input[@id='order_id_408996']"))
	private WebElement orderId;
	
	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getItinerary() {
		return itinerary;
	}
	
}
