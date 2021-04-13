package org.Pom;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class BaseClass {
	public static WebDriver driver;
	public static Alert alert;

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

	public void CurretUrlTitle() {
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

	public static void type1(WebElement element, String DataPass) {
		element.sendKeys(DataPass);
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

	public void ActionMovetoElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public void ActionRightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public static void ActionDoubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public void ActionDragAndDrop(WebElement source, WebElement target) {
		new Actions(driver).dragAndDrop(source, target).perform();
	}

	public void RobotKeyBoardAction() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void SimpleAlert() {
		alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void ConfirmAlert() {
		alert = driver.switchTo().alert();
		// alert.accept();
		alert.dismiss();
	}

	public void PromptAlert(String data) {
		alert = driver.switchTo().alert();
		alert.sendKeys(data);
		alert.accept();
		// alert.dismiss();
	}

	public void AlertText() {
		alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
	}

	public static void TakesScreenshot(String Screenshotpath) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File loc = screenshot.getScreenshotAs(OutputType.FILE);
		System.out.println(loc);
		File Dest = new File(Screenshotpath);
		FileUtils.copyFile(loc, Dest);
	}

	public void ScrollDown(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void Threadsleep() throws InterruptedException {
		Thread.sleep(5000);
	}

	public void ScrollUp(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public void FrameWebelement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void FrameSize(String iframe) {
		List<WebElement> element = driver.findElements(By.tagName(iframe));
		int size = element.size();
		System.out.println(size);
	}

	public void ParentFrameSwitch() {
		driver.switchTo().defaultContent();
	}

	public void NavigateToUrl(String url) {
		driver.navigate().to(url);
	}

	public void NavigateBackPage() {
		driver.navigate().back();
	}

	public void NavigateForwardPage() {
		driver.navigate().forward();
	}

	public void NavigateRefresh() {
		driver.navigate().refresh();
	}

	public void WindowsHandling() throws InterruptedException {
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> AllWindowsId = driver.getWindowHandles();
		System.out.println(AllWindowsId);
		for (String eachid : AllWindowsId) {
			if (!parentId.equals(eachid)) {
				driver.switchTo().window(eachid);
			}
		}
		// driver.switchTo().window(parentId);
	}

	public void WindowSwitchtoParent() throws InterruptedException {
		String parentidpath = driver.getWindowHandle();
		System.out.println(parentidpath);
		Thread.sleep(6000);
		driver.switchTo().window(parentidpath);
	}

	public static void DropDownselectbyIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void DropDownselectbyValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void DropDownSelectByVisibleText(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	public void DropDownGetOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> alloptions = select.getOptions();
		int size = alloptions.size();
		System.out.println(size);
		for (int i = 0; i < alloptions.size(); i++) {
			WebElement webElement = alloptions.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
	}

	public void DropDownGetAllSelectedOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}

	public void DropDownGetFirstSelectedOptions(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}

	public void DropDownDeselectbyIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public void DropDownDeselectbyValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public void DropDownDeSelectByVisibleText(WebElement element, String data) {
		Select select = new Select(element);
		select.deselectByVisibleText(data);
	}

	public void DropDownDeSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public void DropDownIsMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		System.out.println(multiple);
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

	public String getDataFromExcelSheet(String execlpath, String sheetName, int indexRowno, int indexCellNo)
			throws IOException {
		File file = new File(execlpath);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(indexRowno);
		Cell cell = row.getCell(indexCellNo);
		int cellType = cell.getCellType();
		String value = "";
		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			java.util.Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
			value = dateFormat.format(dateCellValue);
		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			value = String.valueOf(l);
		}
		return value;

	}
	public static void EnterDataInExcel(WebElement element,String pathname,String ExcelName) throws IOException {
		File file=new File(pathname);
		Workbook workbook=new XSSFWorkbook();
		Sheet Sheet = workbook.createSheet(ExcelName);
		Row row = Sheet.createRow(0);
		Cell Cell = row.createCell(0);
		String attribute = element.getAttribute("value");
		Cell.setCellValue(attribute);
		FileOutputStream o=new FileOutputStream(file);
		workbook.write(o);
		
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
	public static void ParticularWordTakesScreenShotExtentReport(WebElement element,String pathname) throws IOException {
		File screenshotAs=element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File(pathname));
		
		
	}
}
