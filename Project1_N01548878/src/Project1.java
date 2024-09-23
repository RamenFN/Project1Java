import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int userChoice;
		String[] NamesList; // LEFT OF ON CREATING THE LIST OF STUDENTS (MAYBE MAKE IT A METHOD)
		
		while (true) {
			print("
				1: Display List Ordered
				2: Display Full Names
				3: Display Single Names
				4: Display Name Statistics
				5: Display Names with Even Length
				6: Display Names with Odd Length
				7: Display Names not Capitalized
				8: Display Most Frequent Name
				9: Enter new list of Names
				0: Quit Program
					");"
			userChoice = scnr.nextInt();
			
			if (userChoice == 0) {
				break;
			}
			
			switch(userChoice) {
				case 1:
					DisplayListOrdered();
					break;
				case 2:
					DisplayFullNames();
					break;
				case 3:
					DisplaySingleNames();
					break;
				case 4:
					DisplayNameStats();
					break;
				case 5:
					DisplayEvenLengthNames();
					break;
				case 6:
					DisplayOddLengthNames();
					break;
				case 7:
					DisplayNonCapitalizedNames();
					break;
				case 8:
					DisplayFreqNames();
					break;
				case 9:
					NewNameLists();
					break;
				
			}// end switch
		
		}// end while
		
				
		
	}//end main

}//end class
