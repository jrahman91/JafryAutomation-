package javaAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spiceJet {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/jafry.rahman/Desktop/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String url= "https://www.spicejet.com/";
		
		driver.get(url); 
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@id=\"ctl00_mainContent_ddl_originStation1_CTXTaction\"]")).click();
		
		driver.findElement(By.xpath("//a[@value= \"BLR\"]")).click();
		
		driver.findElement(By.xpath("//span[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXTaction\"]")).click();
		
		driver.findElement(By.xpath("//a[@value=\"MAA\"][1]")).click();
		System.out.println(driver.findElement(By.xpath("//a[@value=\"MAA\"][1]")).getText());
		
				
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_SeniorCitizenDiscount\"]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_SeniorCitizenDiscount\"]")).isEnabled());
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_btn_FindFlights\"]")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.quit();
		
		
		
				
		
		
		
		
		

	}

}
