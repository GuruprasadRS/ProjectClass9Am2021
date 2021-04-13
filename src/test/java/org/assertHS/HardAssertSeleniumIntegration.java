package org.assertHS;

import java.io.IOException;
import java.lang.reflect.Method;

import org.Pom.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertSeleniumIntegration extends BaseClass {
	@BeforeClass
	private void beforeclass() {
		getDriver();
		loadUrl("https://www.facebook.com/");
		Maximize();
	}

	@BeforeMethod
	private void BeforeMethod() {
		Date();
	}

	// HardAssert
//	@Test
//	private void tc1Login() {
//		WebElement user = driver.findElement(By.id("email"));
//		user.sendKeys("Guru");
//		String attribute = user.getAttribute("value");
//		Assert.assertEquals("Guru", attribute);
//}
	//SoftAssert
	@Test
	private void tc2Login() {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Guru");
		String attribute = user.getAttribute("value");
		SoftAssert assert1=new SoftAssert();
		assert1.assertEquals("Gru",attribute );
		assert1.assertAll();
		System.out.println("Assert Fails");

	}

	@Test
	private void Result() {
		System.out.println("End");
	}

	@AfterMethod
	private void Screenshot(Method method) throws IOException {
		MultipleTakesScreenshot(method.getName());
	}

	@AfterClass
	private void Quits() {
		Quit();
	}
}
