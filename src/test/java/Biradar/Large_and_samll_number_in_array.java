package Biradar;

import java.util.Arrays;

public class Large_and_samll_number_in_array {

	public static void main(String[] args) {
		
		 int arr[]= {10,20,30,40,400,501,6,1};
	int largest_num=arr[0];
	int second_large=arr[0];
	int smallest_num=arr[0];
	int second_smallest=arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>largest_num)
		{
			second_large=largest_num;
			largest_num=arr[i];
		}
	
		else if(arr[i]<smallest_num)
		{ 
			second_smallest=smallest_num;
			smallest_num=arr[i];
		}
		
	}
		 System.out.println(Arrays.toString(arr));
		System.out.println("The largest number is:"+largest_num);
		System.out.println("The second largest number is:"+second_large);
		System.out.println("The smallest number is:"+smallest_num);
		System.out.println("The second smallest number is :"+second_smallest);
	}

}
