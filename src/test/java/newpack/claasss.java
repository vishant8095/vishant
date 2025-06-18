package newpack;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class claasss {
         WebDriver driver;
    @BeforeClass
	      void setup()
	    {
	    	 driver=new ChromeDriver();
	  
	    }
         @Test(dataProvider="dq")
	      void login(String email, String pwd)
	      { 
          	 driver.manage().window().maximize();
        	 driver.get("https://tutorialsninja.com/demo/");
	    	 driver.findElement(By.xpath("//span[.=\"My Account\"]")).click();
	    	 driver.findElement(By.xpath("//a[.=\"Login\"]")).click();
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	 driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
	    	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	    	 driver.findElement(By.xpath("//input[@value='Login']")).click();
	    	boolean status= driver.findElement(By.xpath("//h2[.='My Account']")).isDisplayed();
	    	if(status==true)
	    	{
	    		driver.findElement(By.xpath("//div[@class='list-group']/a[13]")).click();
	    		Assert.assertTrue(true);
	    	}
	    	else
	    	{
	    		Assert.fail();
	    	}
	      }
	   @AfterClass
	void teardown()
	{
	driver.quit();
	}
	@DataProvider(name="dq",indices= {2,3})
	Object[][] logindata()
	{
		Object[][] data= {{"vishant","12356l"},
				{"gfhjdkdhdj","dffhjfjfh"},
				{"vishantbiradar143@gmail.com","Vishant1@8095"},
				{"vishantbiradar143@gmail.com","Vishant@8095"},
		};
	    return data;
	}
}
