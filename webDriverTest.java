package javaAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webDriverTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/jafry.rahman/Desktop/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		
		//STEP 1
		String URL= "https://www.yahoo.com/";
		driver.get(URL);
		driver.manage().window().maximize();
		
		
		String title= "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
		
		if (driver.getTitle().equals(title)) {System.out.println("Title page is correct");
		
		}
		System.out.println(driver.getTitle());
		
		//STEP 2
		//STEP 3
		
		//STEP 4
		
		driver.findElement(By.xpath("//input[@id=\"ybar-sbq\"]")).sendKeys("New York City");
		Thread.sleep(1000);
		
		//STEP 5
		driver.findElement(By.xpath("//input[@id=\"ybar-search\"]")).click();
		
		
		//STEP 6
		
		WebDriverWait wait = new WebDriverWait(driver,7);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id= \"logo\"]")));
		
		//STEP 7
		
		driver.findElement(By.xpath("//a[@id=\"ysignin\"]")).click();
		
		//STEP 8
		
		//test was incorrect. should display TRUE
		
		//driver.findElement(By.xpath("//span[@class=\"stay-signed-in checkbox-container\"]")).click();
		
		System.out.println(driver.findElement(By.xpath("//span[@class=\"stay-signed-in checkbox-container\"]")).isSelected());
		
		//STEP 9
		
		//STEP 10
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
	

	}

}
