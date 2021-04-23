package javaAutomation;

import java.util.ArrayList;

public class javaAssignment5 {

	public static void main(String[] args) {
		
			
	
		ArrayList<String> myArrayList = new ArrayList<String>();
		
		myArrayList.add("Chrome");
		myArrayList.add("FireFox");
		myArrayList.add("IE");
		myArrayList.add("Safari");
		myArrayList.add("Chrome");
		
		System.out.println(myArrayList);
		
		//myArrayList.get(2);
		//System.out.println(myArrayList.get(2));
		
		//myArrayList.set(4, "Edge");
		//System.out.println(myArrayList);
		
		//STEP 1
		
		System.out.println(myArrayList.size());
		
		//STEP 2
		
		for(String browsers : myArrayList) {
			System.out.println(browsers);
		}
		
		//STEP 3
		
		myArrayList.get(2);
		System.out.println(myArrayList.get(2));
		
		
		//STEP 4
		
		if(myArrayList.contains("IE")) {System.out.println("IE found at index 2");
		
		}
		
		//STEP 5
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
