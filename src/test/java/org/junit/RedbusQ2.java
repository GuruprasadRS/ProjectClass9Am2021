package org.junit;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusQ2 {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Basic Framework Workspace 29.03.2021\\MavenDay1DataDriven\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(driver.getCurrentUrl().contains("redbus"));
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
		
		WebElement findElement = driver.findElement(By.xpath("//div[@id='select_box_sign']"));
		findElement.click();
		
		WebElement findElement2 = driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']"));
		findElement2.click();
		
		WebElement findElement3 = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(findElement3);
		Thread.sleep(5000);
		
		WebElement userPhone = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		userPhone.sendKeys("8680883618");
		Assert.assertEquals("8680883618", userPhone.getAttribute("value"));
	}
	
}
