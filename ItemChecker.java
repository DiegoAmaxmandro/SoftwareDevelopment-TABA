package taba_SD;
/**
 * @author diegolemos
 *
 */

import java.util.Random;

public class ItemChecker {
	
//******************************************** Question 1 *************************************************	
	//Declare variables
	String passpId;
	
	
	//This is the default constructor
	public ItemChecker(){
		
	}
	
	public boolean passpValidation(String passpId){
	//This is a condition to test the input size, in case of the length be different of 11 characters, 
	//the method already returns false and then the passport id is invalidated.
		
		if(passpId.length() != 11 ) {
			return false;
		}
	//Here I created eleven variables each one getting one character of the input so individually each is tested and validated as required.
		char passpCh1  = passpId.charAt(0);
		char passpCh2  = passpId.charAt(1);
		char passpCh3  = passpId.charAt(2);
		char passpCh4  = passpId.charAt(3);
		char passpCh5  = passpId.charAt(4);
		char passpCh6  = passpId.charAt(5);
		char passpCh7  = passpId.charAt(6);
		char passpCh8  = passpId.charAt(7);
		char passpCh9  = passpId.charAt(8);
		char passpCh10 = passpId.charAt(9);
		char passpCh11 = passpId.charAt(10);
		
	//The first condition checks if the first character is either P or L, if not it returns false and then the passport id is invalidated. 	
		if(!(passpCh1 == "P".charAt(0) || passpCh1 == "L".charAt(0)))  {
			
			return false;
		}
	
	//This condition checks if the second character is a space,	if not it returns false and then the passport id is invalidated.
		else if(passpCh2 != " ".charAt(0)) {
			
			return false;
		}
	
	//In this condition I use the isLetter method to make sure that the third character is a letter and then if not it returns false and then the passport id is invalidated.
		else if(!(Character.isLetter(passpCh3))) {
			
			return false;
		}
	
	//In this condition it's checks if there is a dash,	if not it returns false and then the passport id is invalidated.
		else if(passpCh4 != "-".charAt(0)) {
			
			return false;
		}
	//From this condition a head it's checked if there a number otherwise it returns false and the passport id is invalidated.
		else if(!(Character.isDigit(passpCh5))) {
			
			return false;
		}
		
		else if(!(Character.isDigit(passpCh6))) {
			
			return false;
		}
		
		else if(!(Character.isDigit(passpCh7))) {
			
			return false;
		}
		
		else if(!(Character.isDigit(passpCh8))) {
			
			return false;
		}
		
		else if(!(Character.isDigit(passpCh9))) {
			
			return false;
		}
		
		else if(!(Character.isDigit(passpCh10))) {
			
			return false;
		}
		
		else if(!(Character.isDigit(passpCh11))) {
			
			return false;
		}
		
		return true;
	}
	
//This method give back the validation of the passport id using the method above to consider if all the characters is valid or not.	
	public void validPasspId(String passpId) {
		this.passpId = passpId;
		if(passpValidation(passpId)){
			
			System.out.println("Your passport number is valid. \n");
			
		}else {
			
			System.out.println("Your passaport number is NOT valid.\n");
		}
		
	}

// Getter and Setter.	
	public String getPasspId() {
		return passpId;
	}

	public void setPasspId(String passpId) {
		this.passpId = passpId;
	}
	
	
//************************************** Question 2 ***********************************************************	
	//Declare variables
	String [] user;
	String userID;
	String letters = "abcdefghijklmnopqrstuvwxyz"; //List of characters to be chosen randomly.
	String numbers = "13579";//List of possibles numbers to be chosen randomly.
	StringBuffer sb = new StringBuffer();//Declare StringBuff to add the character choose.
	
	Random rand = new Random();// Declaring the random object
	
	public void userIdGenerator(int n) {
		
		user = new String[n];//Initializing the array of string declared before to receive the characters by index.
		
		//First for loop to generate user codes according to the quantity inputed.		
		for(int i = 0; i < n; i++) {
			for(int l = 0; l < 5; l++) {//Second for loop to generate the first 5 characters of the code randomly based on
				//the list of characters inside of the letters variable, declared above.
			char let = letters.charAt(rand.nextInt(letters.length()));
			sb.append(let);//Here the characters are being added into the StringBuffer.
			}
			for(int b = 0; b < 3; b++) {//Third for loop to generate the last 3 characters based on what was provide. Inside of
				// the variable numbers.
			char num = numbers.charAt(rand.nextInt(numbers.length()));
			sb.append(num);//Here the numbers are being added into the StringBuffer.
			}
			
			
			userID = sb.toString();//String userID getting what is inside of the StringBuffer
			user[i] = userID;//Now passing it to the array.
			System.out.println("User ID number " + (i + 1) + ": " + user[i]);//Printing the code results after the loops.
			sb.delete(0, sb.length());//This is to clean the StringBuffer before the next loop and not accumulate the codes that came before.
			
			
		}
		
		
		
		
	}
	
	//Getters and Setters.
	
	public String getUserID() {
		return userID;
	}

	public String[] getUser() {
		return user;
	}

	public void setUser(String[] user) {
		this.user = user;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getLetters() {
		return letters;
	}

	public void setLetters(String letters) {
		this.letters = letters;
	}

	public String getNumbers() {
		return numbers;
	}

	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}
	

}//Class
