package practice;

import java.util.Scanner;


 class m{
	
}

public class palindrome_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int orginal_num=num;
		int reverse_num=0;
		while(num>0)
		{
			reverse_num=reverse_num*10+num%10;
			num=num/10;
		}
      
		if(reverse_num==orginal_num)
		{
		  System.out.println("the number is polindrome");
		}
		else {
			System.out.println("the number is not polindrome");
		}
	}

}
