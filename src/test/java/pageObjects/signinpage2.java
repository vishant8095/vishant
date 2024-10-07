package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinpage2 {

	WebDriver driver;
	
	@FindBy(xpath="//input[@id='ap_password']")    //input[@id='ap_password']
	WebElement txtpassword;
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signbutton;
	
	public void setpassword(String str)
	{
		txtpassword.sendKeys(str);
	}
	public void clicksignbutton()
	{
		signbutton.click();
	}
	public signinpage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
}
