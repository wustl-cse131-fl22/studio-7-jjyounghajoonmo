package studio7;

import java.util.Scanner;

public class Rectangle {
	
	public static double areaOf(double length, double width) {
		
		double area = length * width;
		return area;
		
	}
	
	public static double perimeterOf(double length, double width) {
		
		double perimeter = 2 * length + 2 * width;
		return perimeter;
		
	}
	
	public static boolean square(double length, double width) {
		
		boolean square = false;
		if (length == width) {
			square = true;
			
		} else {
			square = false;
			
		}
		
		return square;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the length of the rectangle?: ");
		double l = scan.nextDouble();
		System.out.println("What is the width of the rectangle?: ");
		double w = scan.nextDouble();
		
		System.out.println("The area of the rectangle is: " + areaOf(l, w));
		System.out.println("The perimeter of the rectangle is: " + perimeterOf(l, w));
		System.out.println("T/F: Is the rectangle a square: " + square(l, w));

	}

}
