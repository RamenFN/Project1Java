import java.util.Scanner;
import java.util.Arrays;

public class Project1 {
	
	public static void DisplayListOrdered(String[] names) {
		
		//Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(names));
	}//done
	
	public static void DisplayFullNames(String[] names) {
		
		//Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
		for (int i = 0; i < names.length; i++){
			if (names[i].contains(" ")) {
				System.out.println(names[i]);
				

			}
		}
	}

	public static void DisplaySingleNames(String[] names) {
		//Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
		for (int i = 0; i < names.length; i++){
			if (!(names[i].contains(" "))) {
				System.out.println(names[i]);
			}
		}
	}
	
	public static void DisplayNameStats(String[] names) {
		int nameCount = names.length;
		int letterCount = 0;
		double avgNameLength = 0.0;
		String shortestName = names[0];
		String longestName= names[0];
		double populationStandardDeviation = 0.0;

		// Letter Count
		for (int i = 0; i < names.length; i++) {
			letterCount += names[i].length();
			if (names[i].contains(" ")) {
				letterCount--;
			}
			}
		// Avgerage Name Length
		avgNameLength = (double) letterCount / nameCount;
		
		// Shortest Name
		for (int i = 0; i < names.length; i++) {
			if (shortestName.length() < names[i].length()){
				shortestName = names[i+1];
			} 
		}
		// Longest Name
		for (int i = 0; i < names.length; i++) {
			if (longestName.length() < names[i].length()){
				longestName = names[i];
			} 
		}
		System.out.printf("Name Count: %d\nLetter Count Total: %d\nAvg Name Length: %.1f\nShortest Name: %s\nLongest Name: %s\nPopulation Standard Deviation: %f\n", nameCount, letterCount, avgNameLength, shortestName, longestName, populationStandardDeviation);
	}
	
	public static void DisplayEvenLengthNames(String[] names) {
		for (int i = 0; i < names.length; i++) {
		String nameWithoutSpaces = names[i].replaceAll("\\s+", "");
		if (nameWithoutSpaces.length() % 2 == 0) {
			System.out.println(names[i]);  // Print the original name (with spaces)
		}
	}
		
	}// done
	
	public static void DisplayOddLengthNames(String[] names) {
		for (int i = 0; i < names.length; i++) {
			String nameWithoutSpaces = names[i].replaceAll("\\s+", "");
			if (nameWithoutSpaces.length() % 2 != 0) {
				System.out.println(names[i]);  // Print the original name (with spaces)
			}
		}
	}
	
	public static void DisplayNonCapitalizedNames(String[] names) {
		for (int i = 0; i < names.length; i++) {
			String nameWithoutSpaces = names[i].replaceAll("\\s+", "");
			if (names[i].)
		}
 	}
	
	 public static void DisplayFreqNames(String[] names) {
        int maxCount = 0;
        String mostFrequent = names[0];
        for (int i = 0; i < names.length; i++) {
            int count = 0;
            for (int j = 0; j < names.length; j++) {
                if (names[i].equalsIgnoreCase(names[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = names[i];
            }
        }
        System.out.println("Most Frequent Name: " + mostFrequent);
    }
	
	public static void NewNameLists() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter new list of names (comma-separated):");
        String input = scnr.nextLine();
        String[] namesList = input.split(",");
        for (int i = 0; i < namesList.length; i++) {
            namesList[i] = namesList[i].trim();
        }
        System.out.println("New list of names entered: " + Arrays.toString(namesList));
    }
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

        //String[] namesList = scnr.nextLine().split(",");
		String[] namesList = {"Emily Johnson", "michael", "Isabella Martinez", "aiden", "ophia nguyen", "Lucas", "olivia kim", "Ethan", "ava patel", "Noah"};
		Arrays.sort(namesList, String.CASE_INSENSITIVE_ORDER);
		int userChoice;
		System.out.println(namesList[0]);
		while (true) {
			System.out.print("1: Display List Ordered\n"
				+ "2: Display Full Names\n"
				+ "3: Display Single Names\n"
				+ "4: Display Name Statistics\n"
				+ "5: Display Names with Even Length\n"
				+ "6: Display Names with Odd Length\n"
				+ "7: Display Names not Capitalized\n"
				+ "8: Display Most Frequent Name\n"
				+ "9: Enter new list of Names\n"
				+ "0: Quit Program\n"
				);
			userChoice = scnr.nextInt();
			
			if (userChoice == 0) {
				break;
			}
			
			switch(userChoice) {
				case 1:
					DisplayListOrdered(namesList);
					break;
				case 2:
					DisplayFullNames(namesList);
					break;
				case 3:
					DisplaySingleNames(namesList);
					break;
				case 4:
					DisplayNameStats(namesList);
					break;
				case 5:
					DisplayEvenLengthNames(namesList);
					break;
				case 6:
					DisplayOddLengthNames(namesList);
					break;
				case 7:
					DisplayNonCapitalizedNames(namesList);
					break;
				case 8:
					DisplayFreqNames(namesList);
					break;
				case 9:
					NewNameLists();
					break;
				
			}// end switch
		
		}// end while
		
				
		
	}//end main

}//end class
