import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.google.common.base.Function;
public class new1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement myaccount=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='My Account']")));
	    myaccount.click();
	    driver.findElement(By.xpath("//a[text()='Login']")).click();  
	    Wait<WebDriver> wait2=new FluentWait<WebDriver>(driver)
	    		.withTimeout(Duration.ofSeconds(20))
	    		.pollingEvery(Duration.ofSeconds(5))
	    		.ignoring(NoSuchElementException.class);
	                          
	      WebElement elemnt =wait2.until(new Function<WebDriver,WebElement >()
	            		  {
	            	              public WebElement apply(WebDriver driver)
	            	              {
	            	       WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
	            	       if(username.isEnabled())
	            	       {
	            	    	   System.out.println("element found");
	            	       }
	            	       return username;
	            	              }});     	
	      elemnt.sendKeys("vishantbiradar143@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vishant@8095");      
       // Waiting 30 seconds for an element to be present on the page, checking
       // for its presence once every 5 seconds.
       WebElement element= wait2.until(new Function<WebDriver, WebElement>() {
         public WebElement apply(WebDriver driver) {
          WebElement loginbtn=  driver.findElement(By.xpath("//input[@value='Login']"));
          if(loginbtn.isDisplayed())
          {
        	  System.out.println("element is found");
          }
          return loginbtn;
         }
       });
       element.click();
       boolean status= driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
       Assert.assertEquals(status, true);    
	}
}
