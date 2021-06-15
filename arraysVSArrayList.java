package javaAutomation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arraysVSArrayList {
	
	
	public static void main(String[] args) {
		
		//Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
		
		/*
		
		String city [] = {"NYC", "Miami", "LA", "Toronto","Austin"};
		
		System.out.println(city.length);
		
		city [4]= "Dallas";
		System.out.println(city [4]);
		
		//To print out the array, use for-each loop
		
		for (String y: city) {
			System.out.println(y);
		}
		
		if (city[1].equals("LA")) {System.out.println("Index 1 is not LA");
		
		} else System.out.println("Index 1 is Miami");
		
		*/
		
		
		
		String bmw [] = {"M2", "M3", "M340i", "M5", "M8"};
		
		System.out.println(bmw.length);
		bmw[2]= "M4";
		System.out.println(bmw[2]);
		
		
		for (String x: bmw) {
			System.out.println(x);
		}
		
		if (bmw[3].equals("X5M")) {System.out.println("Index 3 is X5M");
		
		} else System.out.println("index 3 is M5");
		
		
		
		
		
		
		//MULTI DIMENSIONAL ARRAYS
		
		/*	
		int [][] myNumbers= { {1,2,3,4}, {5,6,7} };
		
		System.out.println(myNumbers[0][2]);
		System.out.println(myNumbers[1][1]);
		*/
		
		
		
	//ARRAY LIST can expand and contract in size where as ARRAYS are limited to size
		
	
		
		
		ArrayList<String> bmwModels= new ArrayList<>(Arrays.asList("M2","M3","M4","M5", "M8"));
		
		
		
		System.out.println(bmwModels.get(3));
		bmwModels.add("X3M");
		bmwModels.add("X5M");
		
		System.out.println(bmwModels.size());
		
		bmwModels.set(0,"M2 Comp");
		
		System.out.println(bmwModels.get(0));
		
		System.out.println(bmwModels);
		
		/*
		 for (String i: bmwModels) {System.out.println(i);
		 
		
		}
		*/
		
		
		
		//ARRAY LIST WITH Integers
		
		ArrayList<Integer> myNumbers= new ArrayList<Integer>();
		myNumbers.add(10);
		myNumbers.add(54);
		myNumbers.add(30);
		myNumbers.add(34);
		myNumbers.add(65);
		myNumbers.add(71);
		
		
		//System.out.println(myNumbers);
		
		Collections.sort(myNumbers);
		
		System.out.println(myNumbers);
		System.out.println(myNumbers.get(1));
		
		
		
		ArrayList<String> watches= new ArrayList<>(Arrays.asList("Tissot", "IWC", "Movado", "Breitling"));
		
		System.out.println(watches);
		
		System.out.println(watches.size());
		
		System.out.println(watches.get(1));
		
		watches.add("Rolex");
		System.out.println(watches.get(4));
		
		watches.remove(2);
		
		watches.add("Tag Heaur");
		
		System.out.println(watches);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
			
		
		
		
		
	}

}
