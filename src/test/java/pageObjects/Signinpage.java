package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {
	
	WebDriver driver;
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement textemail;
	@FindBy(xpath="//input[@id='continue']")
	WebElement cntbutton;
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	WebElement creatbutton;
	
	public void settextemail(String str)
	{
		textemail.sendKeys(str);
	}
	public void clickcntbutton()
	{
		cntbutton.click();
	}
	public void createaccount()
	{
		creatbutton.click();
	}
	public Signinpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	

}
