import java.util.Scanner;

public class LabProgram {

	
	public static int calcNumCharacters(String userString, char userChar) {
		
		int count = 0;
		for (int i = 0; i < userString.length(); i++) {
			
			if (userString.charAt(i) == userChar) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		// n Monday
		
		char letter = scnr.next().charAt(0);
		String phrase = scnr.nextLine();
		
		int count = calcNumCharacters(phrase, letter);
		
		
		if (count == 1) {
			System.out.println(count + " " + letter);
			
		}
		else {
			
			System.out.println(count + " " + letter + "'s");
		}
		
		
	}

}
