package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartQ3 {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Basic Framework Workspace 29.03.2021\\MavenDay1DataDriven\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(driver.getCurrentUrl().contains("flipkart"));
		}
	
	@AfterClass
	public static void afterClass() {
		driver.quit();
		}
	@Before
	public void beforeMethod() {
		Date date = new Date();
		System.out.println(date);
		}
	@After
	public void afterMethod() {
		Date date = new Date();
		System.out.println(date);
		}
	@Test
	public void Test() throws InterruptedException {
		
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		user.sendKeys("Guru");
		Assert.assertEquals("Guru", user.getAttribute("value"));
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Prasad");
		
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();
		
	}
}
