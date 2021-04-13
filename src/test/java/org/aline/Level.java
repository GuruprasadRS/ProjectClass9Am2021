package org.aline;
import org.Pom.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Level extends BaseClass {
	public static void main(String[] args) {
		getDriver();
		loadUrl("https://www.flylevel.com/");
		Wait();
		Maximize();
		
		WebElement Login = driver.findElement(By.xpath("(//span[@class='menu-icon icon-user'])[1]"));
		Login.click();
		
		WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		Email.sendKeys("GuruPrasad");
	
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("Prasad");
		
		WebElement Remember = driver.findElement(By.xpath("//span[text()='Remember me']"));
		Remember.click();
		
		WebElement login = driver.findElement(By.xpath("//div[@id='LoginMemberButton-modal']"));
		login.click();
		
		WebElement close = driver.findElement(By.xpath("//span[@class='icon-modal-close-icon modal-close']"));
		close.click();
		
		WebElement From = driver.findElement(By.xpath("//p[text()='Where from?']"));
		From.sendKeys("Boston");
	}

}