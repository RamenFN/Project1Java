import java.util.Scanner;

public class LabProgram {

	public static int maxMagnitude(int userVal1, int userVal2, int userVal3) {

		int[] arr = {userVal1, userVal2, userVal3};
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i]) > Math.abs(max)) {
				max = arr[i];
			}
		}
		return max;
		

	} // end maxMagnitude method

	public static void main(String[] args) {
		// input
		Scanner scnr = new Scanner(System.in);
		
		int val1 = scnr.nextInt();
		int val2 = scnr.nextInt();
		int val3 = scnr.nextInt();
		
		
		// calc the max magnitude
		int magnitude = maxMagnitude(val1, val2, val3);
		
		// print result
		System.out.println(magnitude);
		
	} // end main
	
} // end class
