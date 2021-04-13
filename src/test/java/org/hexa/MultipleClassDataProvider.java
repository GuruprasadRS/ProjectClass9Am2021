package org.hexa;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.Pom.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleClassDataProvider extends BaseClass {
	@BeforeClass
	private void BrowserLaunch() {
		getDriver();
		loadUrl("https://www.redbus.in/");
		Maximize();
	}
	@BeforeMethod
	private void Dates() {
		Date date = new Date();
		System.out.println(date);
	}
	@Test(dataProvider = "Data", dataProviderClass = ClassProgram2.class)
	private void tc1Login(String s, String s1) {
		WebElement From = driver.findElement(By.xpath("//input[@id='src']"));
		From.sendKeys(s);
		WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
		to.sendKeys(s1);
	}
	@AfterMethod
	private void Screenshot(Method method) throws IOException {
		MultipleTakesScreenshot(method.getName());
	}
	@AfterClass
	private void Closer() {
		Quit();
	}
}
