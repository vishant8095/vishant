package staticclass;
import java.util.Scanner;
public class Test1 {
     public static void main(String[] args) throws Exception {
    	// String str="ac4df5d6";
    	Object[] arr= {1,'a',2,'q'};
    	for(Object value:arr)
    	{
    		if(value instanceof Integer)
    		{
    			System.out.println(value);
    		}
    	}
    	System.out.println("program is complited....");
}}
