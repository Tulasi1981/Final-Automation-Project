package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Blazedemo 
{
	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() throws Exception
	  {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Murari\\Documents\\Automation Setup\\Browser Extension\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();	 
	  }

	
	
@Test
  public void flight_booking()throws Exception
  {
	  driver.get("https://blazedemo.com/");//url
	  Thread.sleep(2000);
	  Select s;
	  
	  //Drop down syntax
	  s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
	  s.selectByIndex(4);// options that we select in drop down
	  Thread.sleep(2000);
	  s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
	  s.selectByIndex(3);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
	  Thread.sleep(2000);
	  
	  
	  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
	  Thread.sleep(2000);
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("Lucky");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Plot-33,Varasiguda,Delhi");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Delhi");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Telangana");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("56789");
	 
	  s=new Select (driver.findElement(By.xpath("//*[@id=\"cardType\"]")));
	  s.selectByIndex(1); //drop down for visa card
	  
	  driver.findElement(By.xpath("//*[@id=\"creditCardNumber\"]")).sendKeys("1234 3456 1256");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"creditCardMonth\"]")).sendKeys("07");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"creditCardYear\"]")).sendKeys("2028");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"nameOnCard\"]")).sendKeys("smeetha");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
	  
	 
	  
 }
 
 
  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
