package javaAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class rahulshetty2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/jafry.rahman/Desktop/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		String URL= "https://www.rahulshettyacademy.com/AutomationPractice/";
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@value=\"radio2\"]")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("USA");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebElement staticDropdown= driver.findElement(By.id("dropdown-class-example"));
		Select dropdown= new Select(staticDropdown);
		dropdown.selectByIndex(2);
		//System.out.println(driver.findElement(By.id("dropdown-class-example")).getText());
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption3\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Jafry");
		
		driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		 
	
		

	}

}
