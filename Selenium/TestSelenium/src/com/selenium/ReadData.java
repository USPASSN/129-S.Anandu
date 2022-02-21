package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	public static void main(String[] args) {
		try
		{
			//specify the path of the file
			File src= new File("C:\\Users\\anand\\OneDrive\\Documents\\Testdata.xlsx");
			//load the file
			FileInputStream fis=new FileInputStream(src);
			
			//load the workbook
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			
			//load the sheet
			XSSFSheet sh1=wb.getSheetAt(0);
			
			//specify the row count which we want to read
			//specify the cell row which we want to read
			
			System.out.println(sh1.getRow(0).getCell(0));
			System.out.println(sh1.getRow(1).getCell(0));
			System.out.println(sh1.getRow(2).getCell(0));
			System.out.println(sh1.getRow(3).getCell(0));
			
			} catch (Exception e)
		{
				System.out.println(e.getMessage());
		}
		
}

}

