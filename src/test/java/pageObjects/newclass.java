package pageObjects;

public class newclass {


	public static void main(String[] args) {
		
		
		int a[]= {10,20,30,30,40,7,100,1000};
		/*int smallest=a[0];
		int secsmall=0;
		for(int i=0;i<a.length;i++)
		{
		    if(a[i]<smallest)
		    {
		    	secsmall=smallest;
		    	System.out.println(secsmall);
		    	smallest=a[i];
		    }
		    if(a[i]<=secsmall&a[i]!=smallest)
		    {
		    	secsmall=a[i];
		    }
		}
		
		System.out.println(smallest);
		
		System.out.println(secsmall);*/
		
    int largest=a[0];
    int seclarge=a[0];
    for(int i=0; i<a.length;i++)
    {
    	if(a[i]>largest)
    	{     seclarge=largest;
    		largest=a[i];
    	}
    	if(a[i]>seclarge&a[i]!=largest)
    	{
    		seclarge=a[i];
    	}
    }
		System.out.println(largest);
		System.out.println(seclarge);
	
	
	
	}
	
}