package javaAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {

	static void myMethod() {}
		
	/*
		System.out.println("Hello this is a method");
			}
	
	static void myInfo(String fName, String lName, int age) {
		System.out.println("My name is " + fName + " " + lName + " and my age is " + age);
		
	}
	
	
	*/
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/jafry.rahman/Desktop/Drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		//myMethod();
		//myInfo("jafry", "Rahman", 30);
		
		String URL = "https://www.google.com/gmail/about/#";
		driver.get(URL);
		
		String expectedTitle = "Gmail - Email from Google";
		
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)) { System.out.println("Verification successfull"); 
		
		} else {System.out.println("verification failed"); }
		
		
		
		
		
		
		
		
		
		
		

	}

}
