package exp2;

public class fibonacci {
	// This Java program calculates and prints the Fibonacci series up to a specified number of terms.
		 //The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones.
		 
		    public static void generateFibonacci(int n) {
		        long firstTerm = 0;
		        long secondTerm = 1;

		        System.out.println("Fibonacci Series up to " + n + " terms:");

		        for (int i = 0; i < n; i++) {
		            System.out.print(firstTerm + " ");

		            // Calculate the next term in the series
		            long nextTerm = firstTerm + secondTerm;
		            firstTerm = secondTerm;
		            secondTerm = nextTerm;
		        }
		    }

		    public static void main(String[] args) {
		        int numberOfTerms = 10; // Change this to generate a different number of terms
		        generateFibonacci(numberOfTerms);
		    }
		}
