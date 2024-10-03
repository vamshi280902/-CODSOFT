package numberGame;

import java.util.Random;
import java.util.Scanner;


public class numberGame {

	public static void main(String[] args) {
		
		int answer,guess;
		
		final int Max = 100;
		
		Scanner in = new Scanner(System.in);
		
		Random rand = new Random();
		
		boolean correct = false;
				
		 answer = rand.nextInt(Max) + 1; 
		 
		 while(!correct) {
			 System.out.println("Guess a number in between 1 to 100");
		 
			 guess = in.nextInt();
			 
			 if (guess > answer) {
			 System.out.println("The number is greater than the number");
		 }
			 else if(guess < answer) {
				 System.out.println("The number is less than the number");
			 }
			 else {
				 System.out.println(" Congratulations You guessed the correct number.");
				 
				 correct = true;
			 }
	}
		 System.exit(0);
}
}