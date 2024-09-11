import java.util.Scanner;

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int length = scnr.nextInt();
      int width = scnr.nextInt();
      int arrowSize;
      
      do {
      arrowSize = scnr.nextInt();
      } while (arrowSize <= width);
      
      for (int i = 0; i < length; i++) {

         for (int h = 0; h < width; h++) {
            System.out.print("*");
         }
            System.out.print("\n");
      }
      
      for (int i = arrowSize; i > 0; i--) {
    	  for (int h = i; h > 0; h--) {
    		  System.out.print("*");
    	  }
    	  System.out.print("\n");
      }
      
   }
}
