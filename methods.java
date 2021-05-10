
public class methods {
	
	
	//METHODS

		static void firstName(String fName) {
			System.out.println(fName + " " + "Rahman");
		}

		static void ageAndName(String firstName, int age) {
			System.out.println(firstName + " is " + age);
		}

		static int number(int x, int y) {
			return x + y;
		}

		static void checkAge(int age) {
			if (age < 18) {
				System.out.println("Access Denied- You Are Not Old Enough");
			} else {
				System.out.println("Acess Granted");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * firstName("Jafry"); 
		 * firstName("Nate"); firstName("Adam"); 
		 * firstName("Nick");
		 */

		ageAndName("Jafry", 30);
		ageAndName("Nate", 31);
		ageAndName("Adam", 29);
		ageAndName("Nick", 29);

		System.out.println(number(4, 4));

		checkAge(19);
		checkAge(17);
		checkAge(30);

	}

}
