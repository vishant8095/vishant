package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingexceldata {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\JavaCourse\\javaprograming\\vishant\\testdata\\testdata.xlsx");
		 XSSFWorkbook  workbook=  new XSSFWorkbook(file);
		 XSSFSheet sheet=workbook.getSheetAt(0);
		String data1=sheet.getRow(11).getCell(2).toString();
	String data2=sheet.getRow(12).getCell(3).toString();
		System.out.println(data1);
	System.out.println(data2);
		
		workbook.close();
		file.close();

		 
		
		
		
	}

}
