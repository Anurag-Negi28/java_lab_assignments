//Write a program statement to accept ten students marks in an array and arrange in ascending order, convert into grades and print marks and grades in tabular form.
//between 40-50 pass
//50 and 75 merit
//above 75 distinction

package exp3;
import java.util.Scanner;
import java.util.Arrays;

public class question1 {
    public static void main(String[] args) {
        int[] marks = new int[10];
        String[] grades = new String[10];

        Scanner scanner = new Scanner(System.in);

        // Accepting student marks
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter marks for Student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        scanner.close();

        // Sort marks in ascending order
        Arrays.sort(marks);

        // Giving grade to marks and storing in grades array
        for (int i = 0; i < 10; i++) {
            if (marks[i] >= 75) {
                grades[i] = "Distinction";
            } else if (marks[i] >= 50) {
                grades[i] = "Merit";
            } else {
                grades[i] = "Pass";
            }
        }

        // Printing marks and grades in tabular form
        System.out.println("Student\tMarks\tGrade");
        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) + "\t" + marks[i] + "\t" + grades[i]);
        }
    }
}
