package L02_DataUsageAndVariables;

import java.security.spec.RSAOtherPrimeInfo;

public class C02_VariableImportantNotes {

	public static void main(String[] args) {

		// Declaration of a variable only happens once
		// Than no declaration can be made
		// But variable can be used as muc as liked


		int number = 20;

		//int number = 30;

		number = 30;

		System.out.println(number); // 30

		number = number + 5;

		System.out.println(number); // 35


		// 2- On the left side of the declaration we only have variable,
		// on the right side we have the value

		int age = 20;

		age = 2 * age +3;

		// 2 * age =40; // variable expected
		// 20 + age;    // variable expected
	}
}


