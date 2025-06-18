package groups;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class Tc001 {
	WebDriver driver;

	@Test(priority=1,groups= {"sanity"})
	void login_fb()
	{
		System.out.println("fb login succesfull");
	}
	@Test(priority=2,groups= {"regression"})
	void login_twitter()
	{
		System.out.println("twitter login succesfull");
	}
	@Test(priority=3,groups= {"sanity","regression","function"})
	void login_watsup()
	{
		System.out.println("watsup login successfull");
	}	
}
