package groups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tc003 {
	WebDriver driver;
          @Test(priority=1,groups= {"sanity"})
	     void logout_fb()
	     {
	    	 System.out.println("lagout fb succesfull");
	     }
         @Test(priority=2,groups= {"regression"})
	   void lagout_twiter()
	   {
		   System.out.println("lagout twitter succesfull");
	   }
         @Test(priority=3,groups= {"sanity","regression","function"})
	  void lagout_watsup()
	  {
		  System.out.println("lagout watsup succesfull");
	  }	
}
