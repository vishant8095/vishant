package stringprogram;

import java.util.Arrays;
import java.util.Scanner;

public class revere_word_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		System.out.println("The orginal string is: "+s);
		String rev_string=" ";
		String[] words=s.split(" ");
		System.out.println(Arrays.toString(words));
		for(String word:words)
		{
			String rev_words=" ";
			for(int i=word.length()-1;i>=0;i--)
			{
				rev_words=rev_words+word.charAt(i);
			}
 		   rev_string=rev_string+rev_words+"  ";

			
		}
       System.out.println("The reverse string is : "+rev_string);
	}

}
