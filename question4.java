//Write a program to input the no. of a month (1-12) and print its equivalent name of the month (1 for jan, 12 for dec)
package exp3;

import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the month number
		System.out.print("Enter the month number (1-12): ");
		int monthNumber = scanner.nextInt();

		// Validate the month number
		if (monthNumber < 1 || monthNumber > 12) {
			System.out.println("Invalid month number. Please enter a number between 1 and 12.");
			return;
		}

		// Array to hold month names
		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		// Print the corresponding month name
		System.out.println("The month name for month " + monthNumber + " is: " + monthNames[monthNumber - 1]);
	}

}
