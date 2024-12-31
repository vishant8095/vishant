package pageObjects;

import java.util.Arrays;

public class class1 {

	public static void main(String[] args) {
		
	  int a[]= {10,20,300,40,50,60};
	  int high_value=a[0];

	  
	  for(int i=0; i<a.length;i++)
	  {
		  if(a[i]>high_value);
		  {
			  high_value=a[i];
		  }

	  }
	  System.out.println("the highest value: "+high_value);


      
	}

}
