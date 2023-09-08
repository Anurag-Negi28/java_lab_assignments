// Write a Java program to accept ten numbers in an array and compute the square of each number. Print the sum of these numbers.

package exp3;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create an array to hold ten numbers
        int[] numbers = new int[10];

        // Input ten numbers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Close the scanner after reading input
        scanner.close();

        int sum = 0;

        // Compute the square of each number and accumulate the sum
        for (int i = 0; i < 10; i++) {
            int square = numbers[i] * numbers[i];
            sum += square;
        }

        // Print the sum of squares
        System.out.println("Sum of squares: " + sum);
    }
}
