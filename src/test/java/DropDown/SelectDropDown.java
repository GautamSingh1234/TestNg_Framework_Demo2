package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectDropDown
{
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void UserForm() throws InterruptedException
	{
		
		WebElement username=driver.findElement(By.xpath("//input[@id='name']"));
		Thread.sleep(1000);
		username.sendKeys("Gautam Singh");
		WebElement emailid=driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(2000);
		emailid.sendKeys("Gautam@gmail.com");
		WebElement phoneNumber=driver.findElement(By.xpath("//input[@id='phone']"));
		Thread.sleep(3000);
		phoneNumber.sendKeys("6396712554");
		WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
		Select selectcountry=new Select(country);
		Thread.sleep(4000);
		selectcountry.selectByVisibleText("India");		
	}
	@AfterClass
	public void logout() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.quit();
	}
}
