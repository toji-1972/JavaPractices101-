package L03_gettingDataFromUSer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_UsingScannerClass {
	public static void main(String[] args) {


		// Question 1 - Receive a double and an integer value from the user and print their sum and product.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a decimal number...");

		double decimalNumber = scanner.nextDouble();

		System.out.println("Please enter an integer...");

		int integer = scanner.nextInt();

		System.out.println("Sum of the taken integer and decimal number is : " + decimalNumber + integer);
		System.out.println("Multiplication of the taken integer nd decimal number is : " + decimalNumber * integer);



















	}
}
