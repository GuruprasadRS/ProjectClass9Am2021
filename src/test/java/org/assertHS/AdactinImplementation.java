package org.assertHS;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.Pom.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdactinImplementation extends BaseClass{
//	@BeforeClass
//	private void beforeclass() {
//		getDriver();
//		loadUrl("http://adactinhotelapp.com/");
//		Assert.assertTrue(driver.getCurrentUrl().contains("adact"));
//		Maximize();
//	}
//
//	@BeforeMethod
//	private void BeforeMethod() {
//		Date();
//	}
	
	@Test(groups= {"smoke"})
	public void Test1() throws InterruptedException {
		getDriver();
		loadUrl("http://adactinhotelapp.com/");
		Maximize();

		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("GuruprasadTest");
		String attribute = user.getAttribute("value");
		SoftAssert assert1=new SoftAssert();
		assert1.assertEquals("GuruprasadTest",attribute );
		assert1.assertAll();
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("GuruprasadGreens");
		String attribute1 = pass.getAttribute("value");
		Assert.assertEquals("GuruprasadGreens", attribute1);
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
	

	}
	
	@Test(groups= {"sanity"},dependsOnGroups={"smoke"},alwaysRun=true)
	public void Test2() {
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(location);
		s.selectByIndex(1);

		WebElement Hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1 = new Select(Hotels);
		s1.selectByIndex(2);

		WebElement RoomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s2 = new Select(RoomType);
		s2.selectByIndex(3);

		WebElement RoomNumbers = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s3 = new Select(RoomNumbers);
		s3.selectByIndex(4);

		WebElement CheckIn = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		CheckIn.sendKeys("15/04/2021");
		String attribute = CheckIn.getAttribute("value");
		Assert.assertNotEquals("16.04.2021", attribute);

		WebElement Checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		Checkout.sendKeys("16/04/2021");

		WebElement Adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4 = new Select(Adult);
		s4.selectByIndex(2);

		WebElement Child = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s5 = new Select(Child);
		s5.selectByIndex(1);

		WebElement submit = driver.findElement(By.xpath("//input[@id='Submit']"));
		submit.click();
		
	}
	@Test(groups= {"Regression"},dependsOnGroups={"smoke"},alwaysRun=true)
	public void Test3() {
		WebElement RadioButton = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		RadioButton.click();

		WebElement contin = driver.findElement(By.xpath("//input[@id='continue']"));
		contin.click();
	}
	@Test(groups= {"Rerun"},dependsOnGroups={"smoke"},alwaysRun=true)
	public void Test4() throws InterruptedException {
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='first_name']"));
		FirstName.sendKeys("Guru");

		WebElement LastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		LastName.sendKeys("Prasad");

		WebElement Address = driver.findElement(By.xpath("//textarea[@id='address']"));
		Address.sendKeys("OMR Chennai");

		WebElement CardNumber = driver.findElement(By.xpath("//input[@id='cc_num']"));
		CardNumber.sendKeys("1234567899876543");

		WebElement cardType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select s2 = new Select(cardType);
		s2.selectByIndex(3);

		WebElement ExpMonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s3 = new Select(ExpMonth);
		s3.selectByIndex(3);

		WebElement ExpYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s4 = new Select(ExpYear);
		s4.selectByIndex(3);

		WebElement CVV = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		CVV.sendKeys("123");

		WebElement BookNow = driver.findElement(By.xpath("//input[@id='book_now']"));
		BookNow.click();
		Thread.sleep(6000);
	}
	@Test(groups= {"EndToEnd"},dependsOnGroups={"smoke"},alwaysRun=true)
	public void Test5() throws InterruptedException {
		Wait wait=new FluentWait(driver).withTimeout(Duration.ofSeconds(100)).pollingEvery(Duration.ofSeconds(2)).ignoring(Throwable.class);
		WebElement element=(WebElement)wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='my_itinerary']")));
		element.click();
		Thread.sleep(9000);
		WebElement clicks = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		clicks.click();
		WebElement doubleclik = driver.findElement(By.xpath("//input[@id='order_id_408996']"));
		ActionDoubleClick(doubleclik);
		Threadsleep();
		WebElement orderNo = driver.findElement(By.xpath("//input[@id='order_id_408996']"));
		String attribute = orderNo.getAttribute("value");
		System.out.println(attribute);
	}
//@AfterMethod
//	private void Screenshot(Method method) throws IOException {
//		MultipleTakesScreenshot(method.getName());
//	}
//
//	@AfterClass
//	private void Quits() {
//		Quit();
//	}
}
