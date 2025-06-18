package newpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parallel {
	WebDriver driver;
	@BeforeClass
	@Parameters({"Browser"})
	void setup(String br) throws InterruptedException
	{	
		switch(br.toLowerCase())
		{
		case  "chrome" :driver=new ChromeDriver(); break;
		case "edge":driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default : System.out.println("invalide browser");return;
		}
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
	}
	@Test
	void checkdisplay()
	{
		boolean Status=driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img")).isDisplayed();
		Assert.assertEquals(Status, true);
	}
	@Test
	void checktittle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@Test
	 void checkurl()
	 {
		 Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 }
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
}
