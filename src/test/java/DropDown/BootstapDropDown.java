package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BootstapDropDown
{
	public WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void programming() throws InterruptedException
	{
		Thread.sleep(4000);
		WebElement dropdown=driver.findElement(By.xpath("//a[normalize-space()='Web']"));
		dropdown.click();
		Thread.sleep(6000);
		
		List<WebElement> total_element=driver.findElements(By.xpath("//div[@class='dropdown-menu m-0 bg-secondary rounded-0 show']//a"));
		
		System.out.println("Total Size: " +total_element.size());
		
		for(WebElement op:total_element)
		{
			String str=op.getText();
			System.out.println(" " + str );
		}
	}
	@AfterClass
	public void close() throws InterruptedException
	{
		Thread.sleep(10000);	
		driver.quit();	
	}
}
