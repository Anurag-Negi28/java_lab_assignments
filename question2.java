//Write a program to accept three digits(0-9) and print all its possible combination 
//example(if the three digits are 123 then all the possible combinations are: 
//123, 132, 213, 312, 321, 231  
package exp3;

import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first digit (0-9): ");
		int digit1 = scanner.nextInt();

		System.out.print("Enter the second digit (0-9): ");
		int digit2 = scanner.nextInt();

		System.out.print("Enter the third digit (0-9): ");
		int digit3 = scanner.nextInt();

		scanner.close();

		if (isValidDigit(digit1) && isValidDigit(digit2) && isValidDigit(digit3)) {
			System.out.println("All possible combinations:");
			generateCombinations(digit1, digit2, digit3);
		} else {
			System.out.println("Invalid input. Please enter digits between 0 and 9.");
		}
	}

	// Check if a digit is valid (between 0 and 9)
	public static boolean isValidDigit(int digit) {
		return digit >= 0 && digit <= 9;
	}

	// Generate and print all possible combinations
	public static void generateCombinations(int digit1, int digit2, int digit3) {
		System.out.println(digit1 + "" + digit2 + "" + digit3);
		System.out.println(digit1 + "" + digit3 + "" + digit2);
		System.out.println(digit2 + "" + digit1 + "" + digit3);
		System.out.println(digit2 + "" + digit3 + "" + digit1);
		System.out.println(digit3 + "" + digit1 + "" + digit2);
		System.out.println(digit3 + "" + digit2 + "" + digit1);
	}

}
