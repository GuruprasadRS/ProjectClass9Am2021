package org.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoAutomationClassTaskQ2 {
	public static void main(String[] args) throws IOException{
		File file = new File("D:\\Basic Framework Workspace 29.03.2021\\MavenDay1DataDriven\\Excel\\DemoAutomationDatas.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet3");
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
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
		}	
	}
	}
	