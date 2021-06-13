package javaAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class shoppingCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/jafry.rahman/Desktop/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://www.fcpeuro.com";
			
		driver.get(URL);
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Thread.sleep(2000);
	
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		WebElement staticDropdown = driver.findElement(By.id("yearDropdown"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(2);
		
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		WebElement staticDropdown2 = driver.findElement(By.id("makeDropdown"));
		Select dropdown2 = new Select(staticDropdown2);
		dropdown2.selectByIndex(2);
		
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		WebElement staticDropdown3 = driver.findElement(By.id("modelDropdown"));
		Select dropdown3 = new Select(staticDropdown3);
		dropdown3.selectByIndex(36);
		
		Thread.sleep(2000);
		
		WebElement staticDropdown4 = driver.findElement(By.id("subModelDropdown"));
		Select dropdown4 = new Select(staticDropdown4);
		dropdown4.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@class=\"searchBar__field align-stretch\"]")).sendKeys("oil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-variant-id=\"1026210785\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//i[@title=\"Go to your cart\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Begin Checkout")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("spree_guest_email_login")).sendKeys("testEmail@yahoo.com");
		driver.findElement(By.partialLinkText("Continue")).click();
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
