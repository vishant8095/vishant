package testBase;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basepage {
     public WebDriver driver;
	@BeforeMethod
	public void lunch()
	{
		ChromeOptions options=new ChromeOptions();
		File file=new File("C:\\Users\\HP\\Documents\\Downloads\\SelectorsHub.crx");
		options.addExtensions(file);
		
	 driver=new ChromeDriver(options);   
	    driver.get("http://www.amazon.in");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}	
	@AfterMethod
	public void quite()
	{
		driver.quit();
	}
	/*
	  public String randomstring()
		{
			String generatestring=RandomStringUtils.randomAlphabetic(5);
			return generatestring;
		}
		public String randomNumber()
		{
			String generatenumber=RandomStringUtils.randomNumeric(5);
			return generatenumber;
		}
		
		public String alphanumber()
		{
			String generatenumber=RandomStringUtils.randomNumeric(5);
			String generatestring=RandomStringUtils.randomAlphabetic(5);
			return (generatenumber+"@"+generatestring);
		} 
	
	*/
	
	
	
	
}
