package practice;

import java.util.Scanner;

public class find_odd_even_nuber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("The number is even: "+num);
		}
		
		else
		{
			System.out.println("The number is odd");
		}
	}

}
