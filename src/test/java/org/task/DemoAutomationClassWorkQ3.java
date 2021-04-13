package org.task;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAutomationClassWorkQ3 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\Basic Framework Workspace 29.03.2021\\MavenDay1DataDriven\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	WebElement country = driver.findElement(By.id("countries"));
	Select s=new Select(country);
	List<WebElement> options = s.getOptions();
	File file = new File("D:\\Basic Framework Workspace 29.03.2021\\MavenDay1DataDriven\\Excel\\Hello1.xlsx");
	Workbook w = new XSSFWorkbook();
	Sheet sheet = w.createSheet("Datas");
	for (int i = 0; i < options.size(); i++) {
		Row r = sheet.createRow(i);
		Cell c = r.createCell(0);
		c.setCellValue(options.get(i).getText());
	}
	FileOutputStream f = new FileOutputStream(file);
	w.write(f);
	System.out.println("Done");
}
}
