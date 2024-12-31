package practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class setexecel_dynamicdta{
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("vishant");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows want?");
	int no_ofrows=	sc.nextInt();
	System.out.println("Enter how many cells want?");
	int no_ofcells=sc.nextInt();
		for(int r=0;r<=no_ofrows;r++)
		{
			       XSSFRow currentrow=sheet.createRow(r);
			for(int c=0;c<=no_ofcells;c++)
			{
				XSSFCell cell=currentrow.createCell(c);
				System.out.println("enter cell value: "+c);
				cell.setCellValue(sc.next());
			}
		}
		FileOutputStream file=new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\JavaCourse\\javaprograming\\vishant\\testdata\\vishant2.xlsx");
		workbook.write(file);
		workbook.close();
		file.close();
	}

	}

