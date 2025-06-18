package practice;

import java.util.Scanner;

public class find_odd_even_nuber {

	public static void main(String[] args) {
		
                 /* Scanner sc=new Scanner(System.in);
                  System.out.println("Enter first number");
                      int num1= sc.nextInt();*/
		int num=123;
                int rev_num=0;      
                 while(num!=0)
                 {
                	    rev_num=rev_num*10+num%10;
                	    num=num/10;
                	     
                 }
                
                        System.out.println(rev_num);          
	}

}
