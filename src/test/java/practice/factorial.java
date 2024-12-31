package practice;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int Factorial=1;
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			Factorial=Factorial*i;
		}
System.out.println("The factorial value is :"+Factorial);
	}

}
