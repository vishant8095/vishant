package newpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class class1 {
            @BeforeClass
	      void m1()
	      {
	    	  System.out.println("Thise is m1");
	      }
            @Test
	      void m2()
	      {
	    	  System.out.println("Thise is m2");
	      }
            @AfterClass
	      void m3()
	      {
	    	  System.out.println("Thise is m3");
	      }
            @Test
  	      void m4()
  	      {
  	    	  System.out.println("Thise is m4");
  	      }
            @BeforeSuite
    	      void b1()
    	      {
    	    	  System.out.println("Thise is b1");
    	      }
            @AfterSuite
    	      void b2()
    	      {
    	    	  System.out.println("Thise is b2");
    	      }
            
}
