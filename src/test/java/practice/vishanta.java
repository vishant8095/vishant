package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vishanta  {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://blazedemo.com/reserve.php");
	List<WebElement> rows=driver.findElements(By.xpath("//tbody//tr"));
	System.out.println(rows.size());
	List <WebElement> col=driver.findElements(By.xpath("//tbody//td"));
	System.out.println(col.size());
	String data=driver.findElement(By.xpath("//table[@class='table']//tr[3]/td[3]")).getText();
	//System.out.println(data);
	for(int i=0;i<rows.size();i++)
	{
		for(int j=0;j<col.size();j++)
		{
			String data1=driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]/td["+j+"]")).getText();
			System.out.print(data1);
		}
		System.out.println();
	}

}        
}
	


