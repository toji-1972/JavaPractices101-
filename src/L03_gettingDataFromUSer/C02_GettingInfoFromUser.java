package L03_gettingDataFromUSer;

import java.util.Scanner;

public class C02_GettingInfoFromUser {

	public static void main(String[] args) {

		// Question 2 - Get the user's name, surname, and age and print it in the following format.

		//      Name : John
		//      Surname : Doe
		//		Age : 44
		//      Your login has successfully made


		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name");

		String name = scanner.nextLine();

		System.out.println("Please enter your surname");

		String surname = scanner.nextLine();

		System.out.println("Please enter your age");

		int age = scanner.nextInt();

		System.out.println(
				"Name : " + name +
				"\nSurname : " + surname +
				"\nAge : " + age +
				"\nYour login has successfully made"

		);
	}
}
