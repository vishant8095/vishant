package testCases;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Signinpage;
import pageObjects.signinpage2;
import testBase.Basepage;

public class Tc002searchitem extends Basepage{
	@Test
	public void serchitem() throws InterruptedException
	{
		
		
		
		HomePage hm=new HomePage(driver);
		hm.clicksign();
		Signinpage sn=new Signinpage(driver);
		sn.settextemail("8095160964");
		sn.clickcntbutton();
		Thread.sleep(2000);
		signinpage2 sn2=new signinpage2(driver);
		sn2.setpassword("Vishant@8095");
		sn2.clicksignbutton();
		hm.serchitem("shoe");
		hm.clickicon();
		

		hm.selectimg();
		Set<String> winids=driver.getWindowHandles();
		Iterator<String> it=winids.iterator();
		String parentid=it.next();
	String	childid=it.next();
	driver.switchTo().window(childid);
		hm.cartadded();
		hm.gotocart();
		hm.proceedpay();
		hm.useaddress();
		//WebElement frame=driver.findElement(By.xpath("//form[@id='pp-QnRKv8-102']"));
//	driver.switchTo().frame(frame);
		//Thread.sleep(2000);
		//hm.credit("809514623");
	}
	
	
	

}
