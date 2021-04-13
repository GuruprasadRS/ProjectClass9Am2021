package org.classTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcelCreation {
	public static void main(String[] args) throws IOException {
		File file = new File(
				"D:\\Basic Framework Workspace 29.03.2021\\MavenDay1DataDriven\\Excel\\DemoAutomationDatas.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("Sheet3");
		/*Program:1[Overrite or Updating the value in Data Driven]
		Row row = sheet.getRow(4);
		Cell cell = row.getCell(0);
		String name = cell.getStringCellValue();
		if (name.equals("Cucumber")) {
			cell.setCellValue("Guru");
		}
		FileOutputStream ot=new FileOutputStream(file);
		w.write(ot);
		Program:2[Create sheet/row/cell/value]
		Sheet sheet = w.createSheet("NewDataSheet");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Guru Prasad");
		FileOutputStream ot = new FileOutputStream(file);
		w.write(ot);
		System.out.println("Done");*/
		/*program:3[Coverting Decimal Phone Number to long Phone Number]
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType==1) {
					String name = cell.getStringCellValue();
					System.out.println(name);
				}
				if (cellType==0) {
					double numericCellValue = cell.getNumericCellValue();
					long l=(long)numericCellValue;
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);
				}
			}
					}*/
		/*Program:4[Coverting PhoneNumber and Date]
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				System.out.println(cellType);
				if (cellType==1) {
					String name = cell.getStringCellValue();
					System.out.println(name);
				}
				if (cellType==0) {
					if (DateUtil.isCellDateFormatted(cell)) {
						String name=new SimpleDateFormat("dd-MMM-yy").format(cell.getDateCellValue());
						System.out.println(name);
					}
					else {
						String name = String.valueOf((long)cell.getNumericCellValue());
						System.out.println(name);
					}
				}
			}
			
		}*/

	}}
