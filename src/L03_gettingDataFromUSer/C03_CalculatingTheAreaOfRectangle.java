package L03_gettingDataFromUSer;

import java.util.Scanner;

public class C03_CalculatingTheAreaOfRectangle {

	public static void main(String[] args) {

	// Question 3 - Get the lengths of two sides of a rectangle from the user and print the area of the rectangle.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter length of the sides of the rectangle as meters");

		double side1 = scanner.nextDouble();
		double side2 = scanner.nextDouble();

		System.out.println( "The area of th rectangle is : "+ (side1*side2) + "square meters");









	}
}
