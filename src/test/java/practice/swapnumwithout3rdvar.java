package practice;

import java.util.Scanner;

public class swapnumwithout3rdvar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
        int a=sc.nextInt();
        System.out.println("Enter b number");
       int b= sc.nextInt();
       System.out.println("before swaping a is; "+a);
       System.out.println("before swaping b is; "+b);
       a=a+b;
     
       b=a-b;
       a=a-b;
       
       System.out.println("after swaping a is; "+a);
       System.out.println("after swaping b is; "+b);
       
       
	}

}
