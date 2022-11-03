package studio7;

import java.util.Scanner;

public class Fraction {
	
	public static String Add(int n1, int d1, int n2, int d2) {
		
		// Initializing variable
		String answer = "";
		
		// When the denominators are the same
		if (d1 == d2) {
			int top = n1 + n2;
			answer = top + "/" + d1;
		}
		
		return answer;
		
	}
	
	public static String Multiply(int n1, int d1, int n2, int d2) {
		return null;
		
	}
	
	public static String Reciprocal(int n1, int d1, int n2, int d2) {
		return null;
		
	}
	
	public static String Simplify(int n1, int d1, int n2, int d2) {
		return null;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your first numerator?: ");
		int num1 = scan.nextInt();
		System.out.println("What is your first denominator?: ");
		int den1 = scan.nextInt();
		
		System.out.println("What is your second numerator?: ");
		int num2 = scan.nextInt();
		System.out.println("What is your second denominator?: ");
		int den2 = scan.nextInt();
		
		System.out.println(Add(num1, den1, num2, den2));

	}

}
