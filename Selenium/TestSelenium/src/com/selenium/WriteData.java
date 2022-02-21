package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class WriteData {
	public static void main(String[] args) throws Exception, IOException {
		//specify the path of the file
		FileInputStream fis= new FileInputStream("C:\\Users\\anand\\OneDrive\\Documents\\Testdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheet("Sheet1");
		
		//create a new row
		Row row= sh1.createRow(5);
		
		//create column
		Cell cell=row.createCell(0);
		
		cell.setCellValue(cell.getStringCellValue());
		
		//create new row value
		cell.setCellValue("Suljic");
		FileOutputStream fos= new FileOutputStream("C:\\Users\\anand\\OneDrive\\Documents\\Testdata.xlsx");
		wb.write(fos);
		fos.close();
		
		System.out.println("End of file");
	}

}
