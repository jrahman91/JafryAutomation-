package javaAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class rahulShetty1 {
		

	public static void main(String[] args) throws InterruptedException {
		
			
		System.setProperty("webdriver.chrome.driver", "/Users/jafry.rahman/Desktop/DevWorkSpace/javaAutomation/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
        String URL= "https://rahulshettyacademy.com/angularpractice/";
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Jafry");
	

		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("jafryr@Yahoo.com");
		
		driver.findElement(By.xpath("//input[@id=\"exampleInputPassword1\"]")).sendKeys("Test123");
		
		driver.findElement(By.xpath("//input[@id=\"exampleCheck1\"]")).click();
		
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown= new Select(staticDropdown);
		dropdown.selectByIndex(0);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.xpath("//input[@id=\"inlineRadio2\"]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"bday\"]")).sendKeys("01/30/1991");
		
		
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
