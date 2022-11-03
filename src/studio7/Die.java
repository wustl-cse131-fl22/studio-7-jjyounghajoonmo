package studio7;

import java.util.Scanner;

public class Die {
	
	public static int randomRoll(int n) {
		
		int randomNum = (int) (Math.random() * n)+ 1;
		
		return randomNum;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How many sides do you want on the die?: ");
		int sides = scan.nextInt();
		
		System.out.println("You rolled: " + randomRoll(sides));
	}

}
