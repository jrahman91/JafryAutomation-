package javaAutomation;

public class arraysVSArrayList {

	public static void main(String[] args) {
		
		//Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
		
		
		
		 String [] cars= {"BMW", "Mercedes", "Audi", "Porsche", "Bentley"};
		 
		
		System.out.println(cars[3]);
						
		cars [2]= "Tesla";
		
		System.out.println(cars[2]);
		
		System.out.println(cars.length);	
		
		//LOOPIING THROUGH ARRAY
		
		for (int x=0; x< cars.length; x++) {
			System.out.println(cars[x]);
		}
		
		
        
		if (cars[3].equals("Porsche")) {System.out.println("Index 3 is Porsche"); }
		else {System.out.println("Index 3 is not porsche"); }
		
		if (cars[1].equals("BMW")) {System.out.println("Index 1 is BMW"); }
		else {System.out.println("Index 1 is Mercedes"); }
		
		
		
		//MULTIDIMENSIONAL Arrays
		
		int [] [] myNumbers = { {1,2,3,4}, {5,6,7} };
		
		System.out.println(myNumbers[0][2]);
		
		int y= myNumbers[1][1];
		System.out.println(y);
		
		
		
		String [] fragrances = {"Maison Francis", "Byredo", "YSL", "Diptyque"};
		System.out.println(fragrances.length);
		System.out.println(fragrances[3]);
		
		fragrances [3]= "Armani Prive";
		System.out.println(fragrances[3]);
		
		if (fragrances[0].equals("Byredo")) {System.out.println( "Index 0 is Byredo"); }
		else {System.out.println("Index 0 is Maison Francis"); }
		
		for (int z=0; z< fragrances.length; z++) {
			System.out.println(fragrances[z]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
