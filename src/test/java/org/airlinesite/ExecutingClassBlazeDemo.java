package org.airlinesite;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExecutingClassBlazeDemo extends BaseClassAirline {
	ExtentReports reports;
	ExtentHtmlReporter htmlReporter;
	ExtentTest extentTest;

	@BeforeClass
	private void beforeClass() throws IOException {
		reports = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("ExtentReportBlazeDemo.html");
		reports.attachReporter(htmlReporter);
		getDriver();
		loadUrl("https://blazedemo.com/");
		Wait();
		Maximize();
		urlTitle();
		CurretUrlTitle();

	}

	@BeforeMethod
	private void beforeMethod() {
		Date();
	}

	@Parameters({ "departcity", "destcity" })
	@Test(priority = 1)
	private void TestCase1Login(int i, int ii) throws IOException {
		extentTest = reports.createTest("Entring BlazeDemo Application");
		extentTest.log(Status.INFO, "verify BlazeDemo URL");
		if (driver.getCurrentUrl().contains("blaze")) {
			extentTest.log(Status.INFO, "URL is Valid");
		}
		extentTest = reports.createTest("Entering Values into All Text Box");
		extentTest.log(Status.INFO, "Verify city textbox is enabled");
		RegisterCityPojoClass register = new RegisterCityPojoClass();

		// DropDownselectbyIndex(register.getDepartureCity(), i);
		WebElement departureCity = register.getDepartureCity();
		if (departureCity.isEnabled() && departureCity.isDisplayed()) {
			extentTest.log(Status.INFO, "Departure Field is Enabled");
			DropDownselectbyIndex(departureCity, i);
		}
		// DropDownselectbyIndex(register.getDestinationCity(), ii);
		WebElement destinationCity = register.getDestinationCity();
		if (destinationCity.isEnabled() && destinationCity.isDisplayed()) {
			extentTest.log(Status.INFO, "Destination Field is Enabled");
			DropDownselectbyIndex(destinationCity, ii);
			org.openqa.selenium.TakesScreenshot Screenshot = (org.openqa.selenium.TakesScreenshot) driver;
			File screenshotAs = Screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs, new File("testcase1airline.png"));
			extentTest.addScreenCaptureFromPath("testcase1airline.png");
		}
		// click(register.getFindFlights());
		WebElement findFlights = register.getFindFlights();
		if (findFlights.isEnabled() && findFlights.isDisplayed()) {
			extentTest.log(Status.INFO, "FindFlights Button is Displayed");
			click(findFlights);
		}
	}

	@Test(priority = 2)
	private void TestCase2ChooseFlights() throws IOException {
		extentTest = reports.createTest("Selecting Find Flights");
		extentTest.log(Status.INFO, "Verify Find Flight is Displayed");
		ChooseFlightsPojoClass choose = new ChooseFlightsPojoClass();
		org.openqa.selenium.TakesScreenshot Screenshot = (org.openqa.selenium.TakesScreenshot) driver;
		File screenshotAs = Screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("testcase2airline.png"));
		extentTest.addScreenCaptureFromPath("testcase2airline.png");
		// click(choose.getChooseFlight());
		WebElement chooseFlight = choose.getChooseFlight();
		if (chooseFlight.isEnabled() && chooseFlight.isDisplayed()) {
			extentTest.log(Status.INFO, "Choose Flight	radio button is Displayed");
			click(chooseFlight);
		}

	}

	@Parameters({ "name", "address", "city", "state", "zipcode", "creditcardnum", "month", "year", "nameoncard" })
	@Test(priority = 3)
	private void TestCase3RegisterDetails(String name, String Address, String city, String State, String Zipcode,
			String Creditcard, String month, String year, String NameonCard) throws IOException {
		extentTest = reports.createTest("Checking the User Details");
		extentTest.log(Status.INFO, "Verify the user Details");
		RegisterDetailsPojoClass registerDetails = new RegisterDetailsPojoClass();
		// type(registerDetails.getName(), name);
		WebElement name2 = registerDetails.getName();
		if (name2.isEnabled()) {
			extentTest.log(Status.INFO, "Name Text box is Enabled");
			type(name2, name);
		}
		// type(registerDetails.getAddress(), Address);
		WebElement address2 = registerDetails.getAddress();
		if (address2.isEnabled()) {
			extentTest.log(Status.INFO, "Address Text Box is Enabled");
			type(address2, Address);
		}
		// type(registerDetails.getCity(), city);
		WebElement city2 = registerDetails.getCity();
		if (city2.isEnabled()) {
			extentTest.log(Status.INFO, "City Text Box is Enabled");
			type(city2, city);

		}
		// type(registerDetails.getState(), State);
		WebElement state2 = registerDetails.getState();
		if (state2.isEnabled()) {
			extentTest.log(Status.INFO, "State Text Box is Enabled");
			type(state2, State);

		}
		// type(registerDetails.getZipCode(), Zipcode);
		WebElement zipCode2 = registerDetails.getZipCode();
		if (zipCode2.isEnabled()) {
			extentTest.log(Status.INFO, "ZipCode Text Box is Enabled");
			type(zipCode2, Zipcode);

		}
		// DropDownselectbyIndex(registerDetails.getCardType(), 2);
		WebElement cardType = registerDetails.getCardType();
		if (cardType.isEnabled()) {
			extentTest.log(Status.INFO, "CardType Text Box is Enabled");
			DropDownselectbyIndex(cardType, 2);

		}
		// type(registerDetails.getCreditCardNumber(), Creditcard);
		WebElement creditCardNumber = registerDetails.getCreditCardNumber();
		if (creditCardNumber.isEnabled()) {
			extentTest.log(Status.INFO, "CreditCardNumber Text Box is Enabled");
			type(creditCardNumber, Creditcard);

		}
		// type(registerDetails.getMonth(), month);
		WebElement month2 = registerDetails.getMonth();
		if (month2.isEnabled()) {
			extentTest.log(Status.INFO, "Month Text Box is Enabled");
			type(month2, month);

		}
		// type(registerDetails.getYear(), year);
		WebElement year2 = registerDetails.getYear();
		if (year2.isEnabled()) {
			extentTest.log(Status.INFO, "Year Text Box is Enabled");
			type(year2, year);

		}
		// type(registerDetails.getNameOnCard(), NameonCard);
		WebElement nameOnCard2 = registerDetails.getNameOnCard();
		if (nameOnCard2.isEnabled()) {
			extentTest.log(Status.INFO, "NameonCard Text Box is Enabled");
			type(nameOnCard2, NameonCard);

		}
		// click(registerDetails.getRememberMe());
		WebElement rememberMe = registerDetails.getRememberMe();
		if (rememberMe.isDisplayed()) {
			extentTest.log(Status.INFO, "Rememberme check Box is Displayed");
			click(rememberMe);
			org.openqa.selenium.TakesScreenshot Screenshot = (org.openqa.selenium.TakesScreenshot) driver;
			File screenshotAs = Screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs, new File("testcase3airline.png"));
			extentTest.addScreenCaptureFromPath("testcase3airline.png");

		}
		// click(registerDetails.getPurchaseFlights());
		WebElement purchaseFlights = registerDetails.getPurchaseFlights();
		if (purchaseFlights.isDisplayed()) {
			extentTest.log(Status.INFO, "PurchaseFlights RadioButton is Displayed");
			click(purchaseFlights);

		}
	}

	@Test(priority = 4)
	private void TestCase4OrderId() throws IOException {
		extentTest = reports.createTest("Printing the Id");
		extentTest.log(Status.INFO, "Verify the ID Details");
		OrderIdDetailsPojoClass id = new OrderIdDetailsPojoClass();
		org.openqa.selenium.TakesScreenshot Screenshot = (org.openqa.selenium.TakesScreenshot) driver;
		File screenshotAs = Screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("testcase4airline.png"));
		extentTest.addScreenCaptureFromPath("testcase4airline.png");
		// getText(id.getPassengerId());
		WebElement passengerId = id.getPassengerId();
		if (passengerId.isDisplayed()) {
			extentTest.log(Status.INFO, "Passenger id Num is Displayed");
			getText(passengerId);

		}
	}

	@AfterMethod
	private void afterMethod(Method method) throws IOException {
		MultipleTakesScreenshot(method.getName());
	}

	@AfterClass
	private void afterClass() {
		Close();
		reports.flush();

	}

}
