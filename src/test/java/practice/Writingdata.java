package practice;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdata {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("data");
		
		XSSFRow row0=sheet.createRow(0);
		row0.createCell(0).setCellValue("Month");
		row0.createCell(1).setCellValue("DAY");
		row0.createCell(2).setCellValue("year");
		
		XSSFRow row1=sheet.createRow(1);
		row1.createCell(0).setCellValue("jan");
		row1.createCell(1).setCellValue("mon");
		row1.createCell(2).setCellValue(2024);
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\JavaCourse\\javaprograming\\vishant\\testdata\\myfile1.xlsx");
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("the file is created...........");
	}  
}
