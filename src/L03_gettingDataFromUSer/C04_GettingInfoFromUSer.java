package L03_gettingDataFromUSer;

import java.util.Scanner;

public class C04_GettingInfoFromUSer {

	public static void main(String[] args) {

		// Question 5 - Provide the user with their first name, last name, and age, and print it in the following format.
		//  Entered info : J Doe, 44


		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name");

		String name = scanner.nextLine();

		System.out.println("Please enter your surname");

		String surname = scanner.nextLine();

		System.out.println("Please enter your age");

		int age = scanner.nextInt();

		System.out.println(

				"You entered : " + name.charAt(0) + " " +
				surname + ", " + age
		);
	}
}
