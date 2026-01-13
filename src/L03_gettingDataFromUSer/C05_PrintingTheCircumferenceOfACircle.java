package L03_gettingDataFromUSer;

import java.util.Scanner;

public class C05_PrintingTheCircumferenceOfACircle {

	public static void main(String[] args) {

		// Question 5 - Get the radius of a circle from the user and print its circumference and area.
		// circumference = 2 * PI * radius, area = PI * radius


		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the radius as cm...");
		double radius = scanner.nextDouble();

		System.out.println("Circumference of the circle : " + (2 * 3.14 * radius));
		System.out.println("Area of the circle : " + 3.14 * radius);







	}
}
