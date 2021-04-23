package javaAutomation;

import java.util.HashMap;

public class javaAssignment6 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> myHashMap = new HashMap<Integer, String> ();
		
		
		//STEP 1
		
		myHashMap.put(1,"Ariana Grande");
		myHashMap.put(2,"Khalid");
		myHashMap.put(3,"Drake");
		
		System.out.println(myHashMap);
		
		//STEP 2
		
		System.out.println(myHashMap.get(2));
		
		
		//STEP 3
		
		System.out.println(myHashMap.size());
		
		//STEP 4
		
		myHashMap.remove(3);
		System.out.println(myHashMap);
		
		
		
			
		
		
		
		

	}

}
