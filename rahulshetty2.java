package javaAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rahulshetty2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/jafry.rahman/Desktop/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		String URL= "https://www.rahulshettyacademy.com/AutomationPractice/";
		driver.get(URL);
		
		driver.manage().window().maximize();
		Thread.sleep(1500);		
				
		driver.findElement(By.xpath("//input[@value=\"radio2\"]")).click();
		
		driver.findElement(By.xpath("//input[@id= \"autocomplete\"]")).sendKeys("USA");
		
		Thread.sleep(1500);
		
		//DROPDOWN MENU
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		Thread.sleep(1500);
		
	
		driver.findElement(By.id("checkBoxOption2")).click();
		
		
		//driver.findElement(By.xpath("//button[@id=\"openwindow\"]")).click();
		//Thread.sleep(1500);
		
		//this code closes the first window, and not the new window that popped up
		//driver.close();
		
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Jafry");
		
		driver.findElement(By.xpath("//input[@id= \"hide-textbox\"]")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
		
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		

	}

}
