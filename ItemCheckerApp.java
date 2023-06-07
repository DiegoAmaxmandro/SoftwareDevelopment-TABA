package taba_SD;

/**
 * @author diegolemos
 *
 */

import java.util.Scanner;

public class ItemCheckerApp {

	public static void main(String[] args) {
		// Declare variables to get the inputs e show outputs
		String passpId;
		int numbPassp;

		System.out.println("************************ Question 1 ************************************");
		System.out.println("VALIDATOR OF PASSPORT NUMBER/ID \n");
		// Declaring the Scanner object
		Scanner enter = new Scanner(System.in);

		// Instantiating the class ItemChecker.
		ItemChecker itemCheckClass = new ItemChecker();

		// Getting the input of how many items will be checked.
		System.out.println("Please enter how many passports numbers you would like to check.");
		numbPassp = enter.nextInt();// Saving the input on the variable numbPassp.

		// A for loop to go though the quantity of passport that will be checked.
		for (int i = 0; i < numbPassp; i++) {
			// I've declared a new Scanner inside the for loop because when I was using the
			// first Scanner object the program was skipping lines
			// during the presses of getting passport numbers.
			Scanner enter2 = new Scanner(System.in);
			// System out print getting asking the next number to be checked and using the
			// index position to point the quantity.
			System.out.println("Please enter the passport number " + (i + 1) + ": ");

			// The passId variable gets the number to be checked and uses the method
			// toUpperCase to put all letter in Upper Case.
			passpId = enter2.nextLine().toUpperCase();
			// So the passpId goes through the method validPasspId that was created in the
			// ItemCheck class and then getting the output if the number it's valid or not.
			itemCheckClass.validPasspId(passpId);
			
			
		}
		
		System.out.println("************************ Question 2 ************************************");
		System.out.println("GENERATOR OF USER CODES. \n");
		//Declare variable to get the quantity of codes.
		int userIdQt;
	
		System.out.println("How many users id would you like to generate?");
		userIdQt = enter.nextInt();//Getting the input
		
		//Calling the method to generate the users codes.
		itemCheckClass.userIdGenerator(userIdQt);
		
		//Finishing the program
		System.out.print("Thank you for using the app!");
		enter.close();
	}// Main

	
}// Class
