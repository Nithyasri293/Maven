
package com.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;

public class DobChange {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\geethalakshmi\\Downloads\\nithya\\Maven\\xlsx spreadsheet\\Details.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fi);
		Sheet sheet = book.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
				int ct = cell.getCellType();
				if (ct==1) {
					String scv = cell.getStringCellValue();
					System.out.println(scv);
					
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date dcv = cell.getDateCellValue();
					System.out.println(dcv);
					SimpleDateFormat simple=new SimpleDateFormat("dd/MMM/yyyy");
					String format = simple.format(dcv);
					System.out.println(format);
					
				}
				else {
					double ncv = cell.getNumericCellValue();
					System.out.println(ncv);
					long lo=(long)ncv;
					System.out.println(lo);
					String name = String.valueOf(lo);
					System.out.println(name);
				}
			}
		}
		
	}

}
