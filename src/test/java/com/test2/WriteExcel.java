package com.test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\geethalakshmi\\Downloads\\nithya\\Maven\\Datas.xlsx");
		Workbook book=new XSSFWorkbook();
		Sheet sheet = book.createSheet("Login");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Username");
		Cell cell1 = row.createCell(1);
		cell1.setCellValue("Password");
		
		FileOutputStream fos=new FileOutputStream(f);
		book.write(fos);
		System.out.println("Done");
	}

}
