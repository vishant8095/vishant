package practice;

import java.util.HashMap;
import java.util.Map;

public class primenumber {

	

	public static void main(String[] args) {
		
		int a[]= {100,120,10,20,30,40,40,50,200,50,60,100};
		int highestno=a[0];
		int schg=0;
		for(int i=0;i<a.length;i++)
		{
			if(highestno<a[i])
				
			{	 	schg=highestno;

				highestno=a[i];
			}
			if(schg<=a[i] )// && a[i]!=highestno)
			{
				//schg=a[i];
			}
		}
		System.out.println("The highets no of given array is:  "+highestno);
		System.out.println("the second highest: "+schg);
		//System.out.println("The length of array is: "+a.length);
	}
	
}