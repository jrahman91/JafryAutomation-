package javaAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void WebDriverTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "/Users/jafry.rahman/Desktop/Drivers/chromedriver");
	  WebDriver driver = new ChromeDriver();
	  
	  String URL= "https://www.yahoo.com/";
	  
	  //Step1   
	  
	  driver.get(URL);
	  
	  String title= "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
	 
	  Assert.assertEquals(title, driver.getTitle());
	  
	  System.out.println(driver.getTitle()); 
	  
	 	  
	 
	  
	  
	  //Step2
	  
	  //could not figure out
	  
      List<WebElement> links = driver.findElements(By.className("class=\"ybar-mod-navigation _yb_h0ovh _yb_1acrx\""));
	  
	  System.out.println(links.size());	
	  
	  
	  
	  driver.findElement(By.xpath("//ul[@role=\"presentation\"]")).getSize();
	  
	  
	  
	  //Step3
	//could not figure out
	  
	  //Step4

	  
	  driver.findElement(By.xpath("//input[@id=\"ybar-sbq\"]")).sendKeys("New York City");
	  
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  
	  //Step5
	  
	  driver.findElement(By.xpath("//input[@id=\"ybar-search\"]")).click();
	  
	  //Step6
	  
	  WebDriverWait wait = new WebDriverWait(driver,7);
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"ybar-search\"]")));
	  
	  //Step7
	  
	  driver.findElement(By.xpath("//a[@id=\"ysignin\"]")).click();
	  
	  //Step8
	  //Could not figure out
	  
	//Step9
	  //Could not figure out
	  
	  //Step10
	  
	  driver.close();
	  
	  
	  	  
	  
	  
  }
  
  
   //@AfterTest
   //having issues with testNG
   
   
   
  
  
  
}
