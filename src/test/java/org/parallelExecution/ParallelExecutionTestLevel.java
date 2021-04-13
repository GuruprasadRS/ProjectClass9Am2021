package org.parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecutionTestLevel {
	@Parameters({"browser"})
	@Test	
	private void Browsers(String s) {
		if (s.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			System.out.println(Thread.currentThread().getId());
			driver.quit();
			}
		else if (s.equalsIgnoreCase("ff")) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			System.out.println(Thread.currentThread().getId());
			driver.quit();
			}
		else if (s.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			System.out.println(Thread.currentThread().getId());
			driver.quit();
			
		}
		}

}