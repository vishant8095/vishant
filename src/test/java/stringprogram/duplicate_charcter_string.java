package stringprogram;

import java.util.Arrays;
import java.util.Scanner;

public class duplicate_charcter_string {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string.....");
	String str=	sc.nextLine();
	char[] ch=	str.toCharArray();
	System.out.println(Arrays.toString(ch));
	int count=0;
	for(int i=0;i<ch.length;i++)
	{
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
			{
				System.out.println("The duplicate charcter is :"+ch[i]);
				count++;
			}
		}
	}
	
		
	System.out.println(count);


	}

}
