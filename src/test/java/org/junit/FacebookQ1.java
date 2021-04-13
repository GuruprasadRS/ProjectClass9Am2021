package org.junit;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookQ1 {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Basic Framework Workspace 29.03.2021\\MavenDay1DataDriven\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
		}
	
	@AfterClass
	public static void afterClass() {
		driver.quit();}
	@Before
	public void beforeMethod() {
		Date date = new Date();
		System.out.println(date);}
	@After
	public void afterMethod() {
		Date date = new Date();
		System.out.println(date);}
	@Test
	public void Test() {
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		user.sendKeys("Guru");
		Assert.assertEquals("Guru", user.getAttribute("value"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("Prasad");
		Assert.assertEquals("Prasad", pass.getAttribute("value"));
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
	}
}
