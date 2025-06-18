package groups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tc002 {
	WebDriver driver;
	@Test(priority=1,groups= {"sanity"})
	void register_fb()
	{
		System.out.println("register fb successfull");
	}
	@Test(priority=2,groups= {"regression"})
	void register_twiter()
	{
		System.out.println("register twitter succesfull");
	}
	@Test(priority=3,groups= {"sanity","regression","function"})
	void register_watsup()
	{
		System.out.println("register watsup succesfull");
	}
}
