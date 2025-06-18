package practice;

import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aramstrong_number {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int orginal_num=sc.nextInt();
		int num=orginal_num;
	//	System.out.println(orginal_num);
		int arm=0 ;   int a;
		while(orginal_num>0)
		{
			a=orginal_num%10;
		//	System.out.println(a);
		orginal_num=orginal_num/10;
		
			arm=arm+a*a*a;
		}
		
		if(arm==num)
		{
			System.out.println("The number is armstrong");
		}
		else {
			System.out.println("The nuber is not armstrong");
		}
	

	}

}
