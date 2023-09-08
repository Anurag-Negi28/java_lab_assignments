// Write a program to find the sum of all integers greater than 40 and less than 250 that are divisible by 5.

package exp3;

public class question5 {
    public static void main(String[] args) {
        int sum = 0;

        // Iterate through numbers from 41 to 249 (inclusive)
        for (int i = 40; i < 251; i++) {
            // Check if the number is divisible by 5
            if (i % 5 == 0) {
                // Add the divisible number to the sum
                sum += i;
            }
        }

        // Print the sum of numbers divisible by 5
        System.out.println("Sum of integers greater than 40 and less than 250 that are divisible by 5: " + sum);
    }
}
