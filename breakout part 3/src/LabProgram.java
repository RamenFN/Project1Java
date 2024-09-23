public class LabProgram{
   
   public static String checkCharacter(String inputString, int index){  
	   char ch = inputString.charAt(index);
	   
	   if (Character.isLetter(ch)) {
		   return "Character '" + ch + "' is a letter";
	   }
	   else if (Character.isDigit(ch)) {
		   return "Character '" + ch + "' is a digit";
	   }
	   else if (Character.isWhitespace(ch)) {
		   return "Character '" + ch + "' is a white space";
	   }
	   else {
		   return "Character '" + ch + "' is unknown";
	   }
   }
   
	public static void main(String[] args) {

		System.out.println(checkCharacter("happy birthday", 2));
		System.out.println(checkCharacter("happy birthday", 5));
		System.out.println(checkCharacter("happy birthday 2 you", 15));
		System.out.println(checkCharacter("happy birthday!", 14));
	}
}
