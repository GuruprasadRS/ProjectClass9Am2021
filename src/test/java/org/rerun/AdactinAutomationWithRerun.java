package org.rerun;
import org.Pom.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdactinAutomationWithRerun extends BaseClass {
	@Test
	public void Test1() throws InterruptedException {
		getDriver();
		loadUrl("http://adactinhotelapp.com/");
		Maximize();

		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("GuruprasadTest");

		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("GuruprasadGreens");

		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();

	}

	@Test
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

	@Test
	public void Test3() {
		WebElement RadioButton = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		RadioButton.click();

		WebElement contin = driver.findElement(By.xpath("//input[@id='continue']"));
		contin.click();
	}

	@Test
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

	}

	@Test
	public void Test5() throws InterruptedException {
	
		WebElement element = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		element.click();
		WebElement clicks = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		clicks.click();
		WebElement doubleclik = driver.findElement(By.xpath("//input[@id='order_id_408996']"));
		ActionDoubleClick(doubleclik);
		WebElement orderNo = driver.findElement(By.xpath("//input[@id='order_id_408996']"));
		String attribute = orderNo.getAttribute("value");
		System.out.println(attribute);
	}
}
