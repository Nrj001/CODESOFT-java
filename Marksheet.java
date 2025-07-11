import java.util.*;

public class Marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subjects = {"Math", "Science", "English", "Computer", "History"};
        int total = 0;

        System.out.println("--- Enter marks out of 100 for each subject ---");
        for (String subject : subjects) {
            System.out.print(subject + ": ");
            int mark = sc.nextInt();
            total += mark;
        }

        double percentage = total / 5.0;
        char grade;

        if (percentage >= 90) grade = 'A';
        else if (percentage >= 75) grade = 'B';
        else if (percentage >= 60) grade = 'C';
        else if (percentage >= 40) grade = 'D';
        else grade = 'F';

        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
