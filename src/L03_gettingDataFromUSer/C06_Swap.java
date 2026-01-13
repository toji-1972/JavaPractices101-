package L03_gettingDataFromUSer;

import java.util.Scanner;

public class C06_Swap {
	public static void main(String[] args) {

		// Question 6- Get two integer from user and swap the values of them.


		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first integer.");

		int number1 = scanner.nextInt();  // 25

		System.out.println("Enter the second integer");

		int number2 = scanner.nextInt();   // 40


		int temp = 0;        // n1 = 25 n2 = 40 temp = 0
		temp = number2;      // n1 = 25, n2 = 40 temp = 40
		number2 = number1;   // n1 = 25  n2 = 25 temp = 40
		number1 = temp;      // n1 = 40  n2 = 25 temp = 40



		System.out.println("number1'st new value : " + number1);   // 40
		System.out.println("number2' nd new value : " + number2);  // 25









	}
}
