package javaprograms;

import java.util.HashMap;
import java.util.Map;
public class duplicates_elementsin_string {
	public static void main(String[] args) {
	/*	String s="vishadsfghfxghhj, xdfbgntt";
		char[]a=s.toCharArray();
		
		Map<Character,Integer> mymap=new HashMap<Character,Integer>();
           int m=1;                  
		      for(int i=0;i<a.length;i++)
		      {
		    	  if(!mymap.containsKey(a[i]))
		    		  {
		    		         mymap.put(a[i], m);
		    		  }
		    	  else {
		    		       mymap.put(a[i], mymap.get(a[i])+m );
		    	  }    
		      }	
		      for(Character l:mymap.keySet())
		      {
		    	  if(mymap.get(l)>1)
		    	  {
		    		 System.out.println(l+"           "+mymap.get(l));
		    	  }
		      }
	*/
		
		
		     String str="visafgtrryytsderdferhantttu";
		   char[]arr=  str.toCharArray();
		     
		     Map<Character, Integer> maps=new HashMap<Character, Integer>();
		      int a=1;
		      
		      for(int i=0;i<arr.length;i++)
		      {
		    	  if(!maps.containsKey(arr[i]))
		    	  {
		    		    maps.put(arr[i], a);
		    	  }
		    	  else
		    	  {
		    		  maps.put(arr[i], maps.get(arr[i])+a);
		    	  }
		      }
		     
		    for(Character ch:maps.keySet())
		    {
		    	if(maps.get(ch)>1)
		    	{
		    		System.out.println(ch+"    :"+maps.get(ch));
		    	}
		    }
		
		
		
		
		
	}	
		
		
		
		
		
		
		

}
