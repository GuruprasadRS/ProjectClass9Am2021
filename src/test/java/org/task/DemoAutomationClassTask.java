package org.task;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoAutomationClassTask {
	public static void main(String[] args) throws IOException{
		File file=new File("D:\\Basic Framework Workspace 29.03.2021\\MavenDay1DataDriven\\Excel\\DemoAutomationDatas.xlsx");
		FileInputStream stream =new FileInputStream(file);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s=w.getSheet("Sheet1");
		//Program:1&2
		int countr = s.getPhysicalNumberOfRows();
		System.out.println(countr);
		Row row = s.getRow(2);
		int count = row.getPhysicalNumberOfCells();
		System.out.println(count);
		Cell cell2 = row.getCell(0);
		System.out.println(cell2);
		//Progarm:3
		Row row2 = s.getRow(2);
		for (int i = 0; i < row2.getPhysicalNumberOfCells(); i++) {
			Cell cell = row2.getCell(i);
			System.out.println(cell);
		}
		//Progarm:4[DemoAutomation Print All Values in The Excel]
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row1 = s.getRow(i);
			for (int j = 0; j < row1.getPhysicalNumberOfCells(); j++) {
				Cell cell = row1.getCell(j);
				System.out.println(cell);
				}
				}	
}
}