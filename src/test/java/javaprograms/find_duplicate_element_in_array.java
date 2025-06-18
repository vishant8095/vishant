package javaprograms;

public class find_duplicate_element_in_array {
	public static void main(String[] args) {
		int []arr= {1,2,3,1,2,3,5,86,7};
		   for(int i=0;i<arr.length;i++)
		   {
			   for(int j=i+1;j<arr.length;j++)
			   {
				   if(arr[i]==arr[j])
				   {
					   System.out.println("duplicate element is : "+arr[i]);
				   }
			   }
		   }
	}

	           
	
	
	
	

}
