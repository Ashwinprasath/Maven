package org.syntax;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FrameWorkSyntax {

	//1.Get data from workbook
	public String workbook(int row, int column) throws IOException {
		String value = "";
		File f = new File("C:\\Users\\Achu\\Maven\\Workbook\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sh = w.getSheet("Sheet1");
		Row r = sh.getRow(row);
		Cell cell = r.getCell(column);
		int cellType = cell.getCellType();

		if (cellType == 1) {
			value = cell.getStringCellValue();
			System.out.println(value);
		} else if (cellType == 0) {
			double ncv = cell.getNumericCellValue();
			long l = (long) ncv;
			 value = String.valueOf(l);
			 System.out.println(value);
		} else {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat d = new SimpleDateFormat("dd-MM-YYYY");
			value = d.format(dateCellValue);
			System.out.println(value);
		}
		return value;
	}
	
	//2.set data in a workbook
	public String setValueToWorkbook(int row, int column) throws IOException {
		String value="";
		File f = new File("C:\\Users\\Achu\\Maven\\Workbook\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sheet = w.getSheet("sheet1");
		Row r = sheet.getRow(row);
		Cell cell = r.getCell(column);
		cell.setCellValue("Ashwin");
		
		FileOutputStream fout= new FileOutputStream(f);
		w.write(fout);
		return value;	
	}
	
	//3.Upadte values in Excel
	public String updateValues(int row , int column) throws IOException {
		String value="";
		
		File f = new File("C:\\Users\\Achu\\Maven\\Workbook\\Book1.xlsx");
		FileInputStream fin= new FileInputStream(f);
		Workbook w= new XSSFWorkbook(fin);
		Sheet sh = w.getSheet("Sheet1");
		Row r = sh.getRow(row);
		Cell cell = r.getCell(column);
		String stringCellValue = cell.getStringCellValue();
		if (stringCellValue.equals("java")) {
			cell.setCellValue("phyton");
		}
		FileOutputStream fout= new FileOutputStream(f);
		w.write(fout);
		return value;
		
	}
	
	//4.
	
}
