package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class number {
   public static void main(String[] args) {
//String str="vishant biradar bidar biradar bidar mustari mustari";

      
      /*  boolean status=false;
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i].equals(arr[j]))
        		{
        			System.out.println("duplicate element :"+arr[j]);
        			status=true;
        		}
        	}
        	if(status=false)
        	{
        		System.out.println("duplicate element is not ther");
        	}
        }
	   
	   */

   /*     HashSet<String > hs=new HashSet<String>();
        for(String name:arr)
        {
        	if(hs.add(name)==false)
        	{ System.out.println("the duplicate element is :"+name);
        	}
        	}*/
       
       //using hashmap
       String str="vishant biradar bidar biradar bidar mustari mustari";
       String[] arr= str.split(" ");
               HashMap<String,Integer> hsm=new HashMap<String,Integer>();
               
             for(String name:arr)
             {   
            	Integer count= hsm.get(name);
            	if(count==null)
            	{
            		hsm.put(name, 1);
            	}
            	else
            	{
            		hsm.put(name, count++);
            	}
            	 
             }
             
             Set <Entry <String, Integer>> entryset=    hsm.entrySet();
             //    for(entry : entryset)
                 {
                	 
                 }
       
        }
	   
	}
 


	


