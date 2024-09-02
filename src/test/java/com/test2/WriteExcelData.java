package com.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WriteExcelData {
	static WebDriver driver;
	public static void browserLaunch() {
		 driver=new EdgeDriver();

	}
	
	public static void urlLaunch(String url) {
		driver.get(url);

	}
	
	public static void username(WebElement we,String value) {
		we.sendKeys(value);

	}
	
	public static void password(WebElement w,String value) {
		w.sendKeys(value);

	}
	
	public static void login(WebElement e) {
		e.click();

	}
	public static String writeExcel(int row1,int cell1,String sheet) throws IOException {
		
		File f=new File("C:\\Users\\geethalakshmi\\Downloads\\nithya\\Maven\\Login.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fi);
		Sheet sheet1 = book.getSheet(sheet);
		for (int i = 0; i < sheet1.getPhysicalNumberOfRows(); i++) {
			Row row = sheet1.getRow(row1);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(cell1);
				
				int ct = cell.getCellType();
				String name;
				if (ct==1) {
					name= cell.getStringCellValue();
					
					
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date dcv = cell.getDateCellValue();
					//System.out.println(dcv);
					SimpleDateFormat simple=new SimpleDateFormat("dd/MMM/yyyy");
					name = simple.format(dcv);
					//System.out.println(format);
					
				}
				else {
					double ncv = cell.getNumericCellValue();
					//System.out.println(ncv);
					long lo=(long)ncv;
					//System.out.println(lo);
					 name = String.valueOf(lo);
					System.out.println(name);
				}
				return name;
			}
		}
		return sheet;
	}

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\geethalakshmi\\Downloads\\nithya\\Maven\\Login.xlsx");
		Workbook book=new XSSFWorkbook();
		Sheet sheet = book.createSheet("Login");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Username");
		Cell cell1 = row.createCell(1);
		cell1.setCellValue("Password");
		
		Row row1 = sheet.createRow(1);
		Cell cellA = row1.createCell(0);
		cellA.setCellValue("nithya29@gmail.com");
		Cell cellB = row1.createCell(1);
		cellB.setCellValue("nithya123");
		
		FileOutputStream fos=new FileOutputStream(f);
		book.write(fos);
		System.out.println("Done");	

	}	

}
