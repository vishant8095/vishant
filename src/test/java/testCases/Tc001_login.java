package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Signinpage;
import pageObjects.signinpage2;
import testBase.Basepage;

public class Tc001_login extends Basepage {

	@Test
	public void logintest() throws InterruptedException
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
		
		
	}
	
	
	
	
	
	
}
