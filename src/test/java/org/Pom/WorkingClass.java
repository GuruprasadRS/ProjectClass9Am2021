package org.Pom;

import java.io.IOException;

public class WorkingClass extends BaseClass {
public static void main(String[] args) throws InterruptedException, IOException {
	getDriver();
	loadUrl("http://adactinhotelapp.com/");
	Maximize();
	AdactinHotelTest1PojoClass login=new AdactinHotelTest1PojoClass();
	type(login.getUsername(), "GuruprasadTest");
	type(login.getPassword(), "GuruprasadGreens");
	click(login.getLogin());
	AdactinHotelTest2 Register1=new AdactinHotelTest2();
	DropDownselectbyIndex(Register1.getLocation(), 1);
	DropDownselectbyIndex(Register1.getHotels(), 2);
	DropDownselectbyIndex(Register1.getRoomType(), 3);
	DropDownselectbyIndex(Register1.getRoomNos(), 4);
	type(Register1.getDatepickin(), "04/04/2021");
	type(Register1.getDatepickout(), "05/04/2021");
	DropDownselectbyIndex(Register1.getAdult(), 2);
	DropDownselectbyIndex(Register1.getChild(), 1);
	click(Register1.getSubmit());
	AdactinHotelTest3 Register2=new AdactinHotelTest3();
	click(Register2.getRadioButton());
	click(Register2.getContinuebtn());
	AdactinHotelTest4 Register3=new AdactinHotelTest4();
	type(Register3.getFirstName(), "Guru");
	type(Register3.getLastName(), "Prasad");
	type(Register3.getAddress(), "Chennai OMR");
	type(Register3.getCcNumber(), "1234567899876543");
	DropDownselectbyIndex(Register3.getCctype(), 3);
	DropDownselectbyIndex(Register3.getExpmonth(), 4);
	DropDownselectbyIndex(Register3.getExpyear(), 5);
	type(Register3.getCccvv(), "123");
	click(Register3.getBookNow());
	AdactinHotelTest5 Register4=new AdactinHotelTest5();
	Threadsleep();
	click(Register4.getItinerary());
	Threadsleep();
	click(Register4.getCheckbox());
	Threadsleep();
	ActionDoubleClick(Register4.getOrderId());
	Threadsleep();
	getAttributeValue(Register4.getOrderId());
	EnterDataInExcel(Register4.getOrderId(), "D:\\\\Basic Framework Workspace 29.03.2021\\\\MavenDay1DataDriven\\\\Excel\\\\Orderid.xlsx", "OrderId");
	Quit();
}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*System.setProperty("webdriver.chrome.driver",
			"D:\\Basic Framework Workspace 29.03.2021\\MavenDay1DataDriven\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	AdactinHotelTest1 hotel=new AdactinHotelTest1();
	WebElement textEmail = hotel.getUsername();
	textEmail.sendKeys("GuruprasadTest");
	WebElement textpass = hotel.getPassword();
	textpass.sendKeys("GuruprasadGreens");
	WebElement login2 = hotel.getLogin();
	login2.click();
	
	AdactinHotelTest2 hotel2=new AdactinHotelTest2();
	WebElement location = hotel2.getLocation();
	Select s = new Select(location);
	s.selectByIndex(1);
	WebElement hotels = hotel2.getHotels();
	Select s1 = new Select(hotels);
	s1.selectByIndex(2);
	WebElement roomType = hotel2.getRoomType();
	Select s2 = new Select(roomType);
	s2.selectByIndex(3);
	WebElement roomNos = hotel2.getRoomNos();
	Select s3 = new Select(roomNos);
	s3.selectByIndex(4);
	WebElement datepickin = hotel2.getDatepickin();
	datepickin.sendKeys("04/04/2021");
	WebElement datepickout = hotel2.getDatepickout();
	datepickout.sendKeys("05/04/2021");
	WebElement adult = hotel2.getAdult();
	Select s4 = new Select(adult);
	s4.selectByIndex(2);
	WebElement child = hotel2.getChild();
	Select s5 = new Select(child);
	s5.selectByIndex(1);
	WebElement submit = hotel2.getSubmit();
	submit.click();*/
	


