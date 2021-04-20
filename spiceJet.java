package javaAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spiceJet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/jafry.rahman/Desktop/DevWorkSpace/javaAutomation/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String URL="https://www.spicejet.com/";
		
		driver.get(URL);
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]")).isEnabled());
		
				
		
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		
		driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]")).click();
		
		driver.findElement(By.xpath("(//a[@value=\"MAA\"])[1]")).click();
		System.out.println(driver.findElement(By.xpath("(//a[@value=\"MAA\"])[1]")).getText());
		
		
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_SeniorCitizenDiscount\"]")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_SeniorCitizenDiscount\"]")).isSelected());
		
		Thread.sleep(1000);
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(5);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_btn_FindFlights\"]")).click();
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
