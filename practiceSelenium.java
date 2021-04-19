package javaAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceSelenium {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.chrome.driver", "/Users/jafry.rahman/Desktop/DevWorkSpace/javaAutomation/Drivers/chromedriver");
		//WebDriver driver = new ChromeDriver();
		
		// IF ELSE STATEMENTS

				// if (27 > 30) {System.out.println("27 is greater than 30"); }
				// else { System.out.println("27 is not greater than 30");}

				// int a= 30;
				// int b= 40;
				// if(a>b) { System.out.println("30 is greater than 40");}
				// else { System.out.println("30 is not greater than 40");}

				// int time = 1500;
				// if (time > 1700) {
				// System.out.println("Good Evening");
				// } else
				// {System.out.println("Good Night");
				// }

				// loops

				// i=0 so since i will print increasing by 1, up to the 5 index.
				// index= (0,1,2,3,4)
				// 0 is the FIRST in the index, then 1,2,3,4. 4 being the FIFTH

				// for (int x=3; x<10; x++) { System.out.println(x);}

				// in this example you can increase by 2
				// for (int x = 2; x<10; x= x+2) {System.out.println(x);}

				// BOOLEANS
				// int x= 5;
				// int y= 7;
				// System.out.println(5>7);

				// boolean isJavaFun = true;
				// boolean isTodayMonday= false;
				// System.out.println(isJavaFun);
				// System.out.println(isTodayMonday);
				
				int X = 7;

				if (X < 0) {
					System.out.println("Number is negative");
				} else if (X < 5) {
					System.out.println("Number is less than 5");
				} else if (5 < X && X < 10) {
					System.out.println("Number is between 5 and 10");
				} else {
					System.out.println("Number is greater than 10");
				}

				//
				
				for (int Y = 1; Y < 11; Y++) {
					System.out.println(Y);
				}
				
				//

				String animal = "Tiger";
				switch (animal) {

				case "Lion":
					System.out.println("The animal is a Lion.");
					break;
				case "Tiger":
					System.out.println("The animal is a Tiger");
					break;
				case "Zebra":
					System.out.println("The animal is a Zebra");
					break;
		
		

	}

}
}
