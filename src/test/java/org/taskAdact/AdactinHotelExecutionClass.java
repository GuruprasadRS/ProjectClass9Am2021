package org.taskAdact;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Date;
import org.Pom.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinHotelExecutionClass extends BaseClass{
	@BeforeClass
	private void beforeclass() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		Maximize();	
	}
	@BeforeMethod
	private void beforeMethod() {
		Date date=new Date();
		System.out.println(date);
	}
	@Parameters({"sou","des"})
	@Test
	private void Tc1Login(String s,String s1) {
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys(s);
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys(s1);
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
	}
	@Parameters({"checkin","checkout"})
	@Test
	private void tc2Register(String d,String d1) {
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		DropDownselectbyIndex(location, 1);
		WebElement Hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		DropDownselectbyIndex(Hotels, 2);
		WebElement RoomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		DropDownselectbyIndex(RoomType, 3);
		WebElement RoomNumbers = driver.findElement(By.xpath("//select[@id='room_nos']"));
		DropDownselectbyIndex(RoomNumbers, 4);
		WebElement CheckIn = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		CheckIn.sendKeys(d);
		WebElement Checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		Checkout.sendKeys(d1);
		WebElement Adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		DropDownselectbyIndex(Adult, 2);
		WebElement Child = driver.findElement(By.xpath("//select[@id='child_room']"));
		DropDownselectbyIndex(Child, 1);
		WebElement submit = driver.findElement(By.xpath("//input[@id='Submit']"));
		submit.click();	
	}
	@Test
	private void tc3Register() {
		WebElement RadioButton = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		RadioButton.click();

		WebElement contin = driver.findElement(By.xpath("//input[@id='continue']"));
		contin.click();
	}
	@Parameters({"First","last","add","cardnum","cvv"})
	@Test
	private void tc4Register(String n,String n1,String n2,String n3,String n4) {
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='first_name']"));
		FirstName.sendKeys(n);
		WebElement LastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		LastName.sendKeys(n1);
		WebElement Address = driver.findElement(By.xpath("//textarea[@id='address']"));
		Address.sendKeys(n2);
		WebElement CardNumber = driver.findElement(By.xpath("//input[@id='cc_num']"));
		CardNumber.sendKeys(n3);
		WebElement cardType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		DropDownselectbyIndex(cardType, 2);
		WebElement ExpMonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		DropDownselectbyIndex(ExpMonth, 2);
		WebElement ExpYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		DropDownselectbyIndex(ExpYear, 3);
		WebElement CVV = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		CVV.sendKeys(n4);
		WebElement BookNow = driver.findElement(By.xpath("//input[@id='book_now']"));
		BookNow.click();
		
	}
	@Test
	private void tc5Submit() throws InterruptedException {
		Wait wait=new FluentWait(driver).withTimeout(Duration.ofSeconds(100)).pollingEvery(Duration.ofSeconds(2)).ignoring(Throwable.class);
		WebElement element=(WebElement)wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='my_itinerary']")));
		element.click();
		Thread.sleep(9000);
		WebElement orderNo = driver.findElement(By.xpath("//input[@id='order_id_408996']"));
		String attribute = orderNo.getAttribute("value");
		System.out.println(attribute);
	}
	
	@AfterMethod
	private void aftermethod(Method method) throws IOException {
		MultipleTakesScreenshot(method.getName());
	}
	@AfterClass
	private void AfterClass() {
		Quit();
	}
	
}
