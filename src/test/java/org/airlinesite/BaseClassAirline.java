package org.airlinesite;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassAirline {
	public static WebDriver driver;
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Basic Framework Workspace 29.03.2021\\MavenDay1DataDriven\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void Wait() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	public	static void urlTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void CurretUrlTitle() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void Maximize() {
		driver.manage().window().maximize();
	}

	public static void type(WebElement element, String Dataemail) {
		element.sendKeys(Dataemail);
	}

	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	public static void getAttributeValue(WebElement element) {
		String text = element.getAttribute("value");
		System.out.println(text);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void Quit() {
		driver.quit();
	}

	public static void Close() {
		driver.close();
	}
	public static void ActionDoubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	public static void TakesScreenshot(String Screenshotpath) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File loc = screenshot.getScreenshotAs(OutputType.FILE);
		System.out.println(loc);
		File Dest = new File(Screenshotpath);
		FileUtils.copyFile(loc, Dest);
	}
	public static void Threadsleep() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void DropDownselectbyIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void VisibilityCheckisEnabled(WebElement element, String Data) {
		if (element.isEnabled()) {
			element.sendKeys(Data);
		}
	}

	public void VisibilityCheckisDisplayed(WebElement element, String Data) {
		if (element.isDisplayed()) {
			element.sendKeys(Data);
		}
	}

	public void VisibilityCheckisSelected(WebElement element) {
		element.click();
		if (element.isSelected()) {
			String text = element.getText();
			System.out.println(text);
		}
	}

	public static WebElement LocatorByXpath(String Xpath) {
		WebElement findElement = driver.findElement(By.xpath(Xpath));
		return findElement;

	}
	public static void MultipleTakesScreenshot(String data) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File loc = screenshot.getScreenshotAs(OutputType.FILE);
		System.out.println(loc);
		File Dest = new File(System.getProperty("user.dir")+"\\Screenshot\\"+data+".png");
		FileUtils.copyFile(loc, Dest);
	}
	public static void Date() {
		java.util.Date date=new java.util.Date() ;
		System.out.println(date);
		
	}
	public static void ParticularWordTakesScreenShot(WebElement element,String pathname) throws IOException {
		File screenshotAs=element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File(pathname));
		
	}
}
