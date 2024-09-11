import java.util.Scanner;
import java.util.Random;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int ROCK = 0;
		final int PAPER = 1;
		final int SCISSORS = 2;
		Random rand = new Random();
		int seed = scnr.nextInt();
		rand.setSeed(seed);

		
		// STEP 1
		
		
		// 3 Anna Bert -3 -4 4
		
		String player1 = scnr.next();
		String player2 = scnr.next();
		int numRounds;
		
		do {
		
			numRounds = scnr.nextInt();
			
			if (numRounds <= 0) {
			
			System.out.println("Rounds must be > 0");
			}// end if
			
		} while (numRounds <= 0);
		
		System.out.println(player1 + " vs " + player2 + " for " + numRounds + " rounds");
		
		// STEP 2
		// 9 Anna Bert 1
		
		int player1Choice;
		int player2Choice;
		int player1Score = 0;
		int player2Score = 0;
		
		for (int i = 0; i < numRounds; i++) {
		
		
		do {
			
			player1Choice = rand.nextInt(3);
			player2Choice = rand.nextInt(3);
			
			if (player1Choice == player2Choice) {
				System.out.println("Tie");
			}
			
		} while(player1Choice == player2Choice);
		
		
			
			if (player1Choice == ROCK && player2Choice == SCISSORS) {
				
				System.out.println(player1 + " wins with rock");
				player1Score++;
			}
			if (player1Choice == PAPER && player2Choice == ROCK) {
				
				System.out.println(player1 + " wins with paper");
				player1Score++;
			}
			if (player1Choice == SCISSORS && player2Choice == PAPER) {
				
				System.out.println(player1 + " wins with scissors");
				player1Score++;
			} 
			
			if (player2Choice == ROCK && player1Choice == SCISSORS) {
				
				System.out.println(player2 + " wins with rock");
				player2Score++;
			}
			if (player2Choice == PAPER && player1Choice == ROCK) {
				
				System.out.println(player2 + " wins with paper");
				player2Score++;
			}
			if (player2Choice == SCISSORS && player1Choice == PAPER) {
				
				System.out.println(player2 + " wins with scissors");
				player2Score++;
			} 
			}
		
			System.out.println(player1 + " wins " + player1Score + " and " + player2 + " wins " + player2Score);
		
		
		
	} // End main
} // End class
