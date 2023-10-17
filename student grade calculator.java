import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ComputerScienceStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String studentName = scanner.nextLine();

        // Define the list of subjects relevant to a computer science student
        String[] subjects = {"Computer Architecture", "Data Structures", "Algorithms", "Database Management"};

        // Define a dictionary to store the marks of each subject
        Map<String, Double> marks = new HashMap<>();

        // Input the marks for each subject
        for (String subject : subjects) {
            System.out.println("Enter the marks obtained in " + subject + " (out of 100): ");
            marks.put(subject, scanner.nextDouble());
        }

        // Calculate Total Marks
        double totalMarks = 0;
        for (double mark : marks.values()) {
            totalMarks += mark;
        }

        // Calculate Average Percentage
        double averagePercentage = totalMarks / subjects.length;

        // Grade Calculation
        String grade = "";
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display Results
        System.out.println("\nResults for " + studentName + ":");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }
}
