package org.baseclass;
import java.awt.AWTException;
import java.io.IOException;
public class ExecutableClass {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		BaseClass e = new BaseClass();
		e.getDriver();
		e.loadUrl("http://adactinhotelapp.com/SearchHotel.php");
		e.Maximize();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//e.Wait();
		//e.urlTitle();
		//e.CurretUrlTitle();
		
		
		/*Visibility Check
		 * WebElement user = driver.findElement(By.id("email"));
		e.VisibilityCheckisEnabled(user, "Guru");
		WebElement pass = driver.findElement(By.id("pass"));
		e.VisibilityCheckisDisplayed(pass, "Prasad");
		e.Threadsleep();
		WebElement locatorByXpath = e.LocatorByXpath("//button[@name='login']");
		e.VisibilityCheckisSelected(locatorByXpath);
		e.Threadsleep();
		e.Quit();*/
		/*dropDown
		 * WebElement ddCountry = driver.findElement(By.xpath("//select[@id='fruits']"));
		e.Threadsleep();
		e.DropDownSelectByVisibleText(ddCountry, "Apple");
		e.DropDownselectbyIndex(ddCountry,0);
		e.DropDownselectbyValue(ddCountry, "grape");
		//e.DropDownGetOptions(ddCountry);
		//e.DropDownGetAllSelectedOptions(ddCountry);
		//e.DropDownGetFirstSelectedOptions(ddCountry);
		//e.DropDownDeselectbyIndex(ddCountry, 1);
		//e.DropDownDeselectbyValue(ddCountry, "grape");
		//e.DropDownDeSelectByVisibleText(ddCountry, "Apple");
		//e.DropDownDeSelectAll(ddCountry);
		//e.DropDownIsMultiple(ddCountry);*/
		
		/*parentWindowSwitching:
			WebElement click = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			e.click(click);
			WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
			e.type(search, "IPhone");
			WebElement clickss= driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
			e.click(clickss);
			e.Threadsleep();
			WebElement clikg = driver.findElement(By.xpath("//a[text()='APPLE iPhone 11 (White, 64 GB)']"));
			e.click(clikg);
			e.WindowsHandling();
			WebElement clicksss = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
			e.click(clicksss);
			e.WindowSwitchtoParent();*/
		
		/*WindowsHandling
		 * WebElement click = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		e.click(click);
		WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		e.type(search, "IPhone");
		WebElement clickss= driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		e.click(clickss);
		e.Threadsleep();
		WebElement clikg = driver.findElement(By.xpath("//a[text()='APPLE iPhone 11 (White, 64 GB)']"));
		e.click(clikg);
		e.WindowsHandling();
		WebElement clicksss = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		e.click(clicksss);*/
		
		/*Frames
		 * e.FrameSize("Frame");
		WebElement b = driver.findElement(By.xpath("//frame[@name='login_page']"));
		e.FrameWebelement(b);
		WebElement frames = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		e.type(frames, "Guru");
		WebElement con = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		e.click(con);
		e.NavigateBackPage();
		e.ParentFrameSwitch();
		e.Threadsleep();
		WebElement b1 = driver.findElement(By.xpath("//frame[@name='login_page']"));
		e.FrameWebelement(b1);
		WebElement con1 = driver.findElement(By.xpath("(//img[@alt='continue'])[2]"));
		e.click(con1);*/
		
		/*ScrollUp/ScrollDown
		 * e.Threadsleep();
		WebElement scrolldown = driver.findElement(By.xpath("//a[text()='RPA']"));
		e.ScrollDown(scrolldown);
		e.Threadsleep();
		WebElement scrollUp = driver.findElement(By.xpath("(//a[text()='All Courses'])[1]"));
		e.ScrollUp(scrollUp);*/
		
		/*TakesScreenshot
		e.TakesScreenshot("D:\\Basic Framework Workspace 29.03.2021\\MavenDay1DataDriven\\Screenshot\\demo.png");*/
		
		//Alert
		/*WebElement click = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		e.click(click);
		WebElement clicks = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		e.click(clicks);
		
		e.PromptAlert("Guru");
		WebElement clicks1 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		e.click(clicks1);
		e.AlertText();*/
		
		/*WebElement click1 = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		e.click(click1);
		WebElement clicks1 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		e.click(clicks1);
		e.SimpleAlert();
		
		WebElement click2 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		e.click(click2);
		WebElement clicks2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		e.click(clicks2);
		e.ConfirmAlert();*/
		
		//DragandDrop
		/*WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		e.ActionDragAndDrop(src, dest);
		//Robot
		WebElement dest1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		e.ActionRightClick(dest1);
		e.RobotKeyBoardAction();*/
		/*
		 * WebElement click =
		 * driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		 * e.click(click);
		 * 
		 * WebElement movetoele =
		 * driver.findElement(By.xpath("//div[text()='Electronics']"));
		 * e.ActionMovetoElement(movetoele);
		 *
		 * WebElement rightclick =
		 * driver.findElement(By.xpath("//div[text()='Electronics']"));
		 * e.ActionRightClick(rightclick);
		 * 
		 * 
		 * WebElement text = driver.findElement(By.id("email")); e.type(text, "java");
		 * e.ActionDoubleClick(text);
		 */

		/*attribute value
		 * WebElement username = driver.findElement(By.id("email")); e.type(username,
		 * "Guru"); e.getAttributeValue(username); WebElement password =
		 * driver.findElement(By.id("pass")); e.type1(password, "Prasad");
		 * e.getAttributeValue(password); WebElement btnclick =
		 * driver.findElement(By.name("login")); e.click(btnclick); e.Quit();
		 */
		// e.Close();

	}
}
