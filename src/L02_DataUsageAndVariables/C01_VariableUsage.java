package L02_DataUsageAndVariables;

public class C01_VariableUsage {

	public static void main(String[] args) {

	int number = 20;

		System.out.println("My Account"); // My Account

		System.out.println("number"); // number

		System.out.println("My name is Seyyid, I'll do whatever I want");


		// İn Java writing a text and writing a variable are different things.
		// To write a text we use "" and java writes what is saw inside "" to the console
		// when we want to see the value of the variable on the console we need to write the name of the variable


		System.out.println(number);

		System.out.println("The value of the variable number: " + number);


		int age = 40;

		System.out.println("the value of the age variable at the line 28 : "+ age);
		// the value of the age variable at the line 28 : 40


		age = age + 5;

		System.out.println("The value of the age variable on the line 34 : " + age);
		// The value of the age variable on the line 34 : 45


		age = 2 * age + 1;

		System.out.println("The value of the age variable at the ine 40 : " + age);
		// The value of the age variable at the ine 40 : 91










	}
}
