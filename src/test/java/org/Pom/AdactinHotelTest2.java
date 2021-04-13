package org.Pom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelTest2 extends BaseClass {

	public AdactinHotelTest2() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//select[@id='location']"))
	private WebElement location;
	
	@FindBy(xpath=("//select[@id='hotels']"))
	private WebElement Hotels;
	
	@FindBy(xpath=("//select[@id='room_type']"))
	private WebElement roomType;
	
	@FindBy(xpath=("//select[@id='room_nos']"))
	private WebElement roomNos;
	
	@FindBy(xpath=("//input[@id='datepick_in']"))
	private WebElement datepickin;
	
	@FindBy(xpath=("//input[@id='datepick_out']"))
	private WebElement datepickout;
	
	@FindBy(xpath=("//select[@id='adult_room']"))
	private WebElement adult;
	
	@FindBy(xpath=("//select[@id='child_room']"))
	private WebElement child;
	
	@FindBy(xpath=("//input[@id='Submit']"))
	private WebElement submit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getDatepickin() {
		return datepickin;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}
