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
	
	//To Read and return emailid
	
	public String excel_username(int a) throws IOException 
	{
		//Locating the Path of the File
		FileInputStream file = new FileInputStream(new File("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\testdata\\write_excel.xlsx"));
		//Locating the Workbook
            XSSFWorkbook workbook = new XSSFWorkbook(file);
          //Locating the Sheet in a workbook
          XSSFSheet sheet = workbook.getSheet("DDFW");
        //Identifying the number of rows
      	   XSSFRow row = sheet.getRow(a);
      	  //Locating the row value
			XSSFCell cell = row.getCell(0);
			String email = cell.getStringCellValue();
			//returning the email id
			return email;
		}

	// TO read and return password
		
		public String excel_password(int b) throws IOException
		{
			//Locating the Path of the File
			FileInputStream file = new FileInputStream(new File("C:\\Users\\3lok\\Desktop\\selenium\\DemoWebshop\\src\\test\\resources\\testdata\\write_excel.xlsx"));
			//Locating the Workbook
	        XSSFWorkbook workbook = new XSSFWorkbook(file);
	        //Locating the Sheet in a workbook
	        XSSFSheet sheet = workbook.getSheet("DDFW");
			XSSFRow row = sheet.getRow(b);
			XSSFCell cell1 = row.getCell(1);
			String pwd = cell1.getStringCellValue();
			return pwd;
		}

	}


