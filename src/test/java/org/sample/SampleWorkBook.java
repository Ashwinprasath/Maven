package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleWorkBook {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Achu\\Maven\\Workbook\\Book1.xlsx");

		FileInputStream fInput = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fInput);

		Sheet sh = w.getSheet("Sheet1");

		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row r = sh.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				System.out.print(c + "			");
			}
			System.out.println("");
		}

	}
}
