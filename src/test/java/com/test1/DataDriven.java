package com.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static void main(String[] args) throws IOException {
	  File f=new File("C:\\Users\\geethalakshmi\\Downloads\\nithya\\Maven\\xlsx spreadsheet\\Details.xlsx");
	  FileInputStream fi=new FileInputStream(f);
	  Workbook book=new XSSFWorkbook(fi);
	  Sheet sheet = book.getSheet("Sheet1");
	  Row row = sheet.getRow(0);
	  Cell cell = row.getCell(0);
	  System.out.println(cell);
	  Row row2 = sheet.getRow(1);
	  Cell cell2 = row2.getCell(0);
	  System.out.println(cell2);
	  
	  for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		  Row r = sheet.getRow(i);
		  for (int j = 0; j < r.getPhysicalNumberOfCells() ; j++) {
			  Cell c = r.getCell(j);
			  System.out.println(c);
		}
		
	}
}

}
