package com.excelutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.WebDriver;

public class ExcelUtil 
{
	WebDriver driver;
	
	
	
	public String excel_username(int a) throws IOException 
	{
           
			FileInputStream file = new FileInputStream(new File("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop2\\src\\test\\resources\\testdata\\write_excel.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("DDFW");
			XSSFRow row = sheet.getRow(a);
			XSSFCell cell = row.getCell(0);
			String email = cell.getStringCellValue();
			return email;
		}

		
		public String excel_password(int b) throws IOException
		{
            
			FileInputStream file = new FileInputStream(new File("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop2\\src\\test\\resources\\testdata\\write_excel.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("DDFW");
			XSSFRow row = sheet.getRow(b);
			XSSFCell cell1 = row.getCell(1);
			String pwd = cell1.getStringCellValue();
			return pwd;
		}

	}


