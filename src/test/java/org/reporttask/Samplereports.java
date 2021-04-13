package org.reporttask;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Samplereports  {
	ExtentReports reports;
	ExtentHtmlReporter htmlReporter;
	WebDriver driver;
	ExtentTest extentTest;

	@BeforeClass
	public void BeforeUrls() {
		reports = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("extentreport.html");
		reports.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterclassMethod() throws InterruptedException {
		Thread.sleep(9000);
		driver.close();
		reports.flush();
	}

	@Test
	public void tc0() {
		extentTest = reports.createTest("Login Adactin Application");
		extentTest.log(Status.INFO, "Login Adactin Application By Valid Username");
		extentTest.log(Status.INFO, "Verify Adactin URL");
		if (driver.getCurrentUrl().contains("adactin")) {
			extentTest.log(Status.PASS, "url is valid");
		} else {
			extentTest.log(Status.FAIL, "Invalid url");
		}
	}

	@Test
	private void tc1() throws IOException {
		extentTest = reports.createTest("Entering Values into Adactin");
		extentTest.log(Status.INFO, "Verifying user name Textbox is enabled");
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		if (username.isEnabled() && username.isDisplayed()) {
			extentTest.log(Status.INFO, "UserNameField is Enabled");
			username.sendKeys("GuruprasadTest");

			File Screenshotas = username.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Screenshotas, new File("Adactin.png"));
			extentTest.addScreenCaptureFromPath("Adactin.png");
		}

		extentTest.log(Status.INFO, "Verifying Password Textbox is Enabled");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		if (password.isEnabled() && password.isEnabled()) {
			extentTest.log(Status.INFO, "PasswordField is Enabled");
			password.sendKeys("GuruprasadGreens");
			File Screenshotas = password.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Screenshotas, new File("Adactins.png"));
			extentTest.addScreenCaptureFromPath("Adactins.png");
		}
		extentTest.log(Status.INFO, "Verifying Login Button is enabled");
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		if (login.isEnabled() && login.isDisplayed()) {
			extentTest.log(Status.INFO, "LoginField is Enabled");
			login.click();
			
			TakesScreenshot screenshot=(TakesScreenshot)driver;
			File loc = screenshot.getScreenshotAs(OutputType.FILE);
			File Dest=new File("Adactinss.png");
			FileUtils.copyFile(loc, Dest);
			extentTest.addScreenCaptureFromPath("Adactinss.png");
		}

	}

}
