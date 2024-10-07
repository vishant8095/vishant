package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")  //span[@id='nav-link-accountList-nav-line-1']
	WebElement signbutton;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement serchbox;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement clickicon;
	@FindBy(xpath="(//div[@class='a-section a-spacing-base a-text-center']//img)[1]")
	WebElement selectimg;
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addcart;
	@FindBy(xpath="(//a[@class='a-button-text'])[1]")  //a[@class='a-button-text']
	WebElement gotocart;
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceedpay;
	@FindBy(xpath="//*[@id=\"orderSummaryPrimaryActionBtn\"]/span/input")
	WebElement useaddress;
	@FindBy(xpath="//input[@id='pp-QnRKv8-103']")
	WebElement credit;
	public void credit(String str)
	{
		credit.sendKeys(str);
	}
	public void useaddress()
	{
		useaddress.click();
	}
	
	public void clicksign()
	{
		signbutton.click();
	}
	public void serchitem(String str)
	{
		serchbox.sendKeys(str);
	}
	public void clickicon()
	{
		clickicon.click();
	}
	public void selectimg()
	{
		selectimg.click();
	}
	public void cartadded()
	{
		addcart.click();
	}
	public void gotocart()
	{
		gotocart.click();
	}
	public void proceedpay()
	{
		proceedpay.click();
	}
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}