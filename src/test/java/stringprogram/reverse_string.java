package stringprogram;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter string");
		String s=sc.next();
		System.out.println("The orginal string: "+s);
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
   System.out.println("The reverse String :"+rev);
	}

}
