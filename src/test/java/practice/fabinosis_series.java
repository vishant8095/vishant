package practice;

import java.util.Scanner;

public class fabinosis_series {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int first=0; 
		int scond=1;
		int sum=0;
		System.out.print(first+" "+scond);
		for(int i=2;i<num;i++)
		{
			sum=first+scond;
			System.out.print(" "+sum);
			first=scond;
			scond=sum;
		}
		
		
		
		

	}

}
