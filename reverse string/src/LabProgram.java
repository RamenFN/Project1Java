import java.util.Scanner;
import java.util.Arrays;

public class LabProgram {

	public static String reverseString(String userInput) {
        String[] result = new String[userInput.length()];
        String[] str2arr = userInput.split("");
       
        int counter = 0;
        for (int i = userInput.length() - 1; i >= 0; i--) {
            result[counter] = str2arr[i];
            counter++;
        }
       
        String finalResult = String.join("", result);
       
        return finalResult;
    }
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input, result;
      
		input = scnr.nextLine();
		result = reverseString(input);	  
		System.out.printf("Reverse of \"%s\" is \"%s\".", input, result);
   }
}
