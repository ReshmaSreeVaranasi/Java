package javacore;
import java.util.Scanner;

class Student {
    private int rollNumber;
    private String studentName;
    private int[] marks;

    // Constructor
    Student(int rollNumber, String studentName, int[] marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    // Calculate total marks
    int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    // Calculate average marks
    double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    // Find highest mark
    int findHighest() {
        int highest = marks[0];

        for (int mark : marks) {
            highest = Math.max(highest, mark);
        }

        return highest;
    }

    // Find lowest mark
    int findLowest() {
        int lowest = marks[0];

        for (int mark : marks) {
            lowest = Math.min(lowest, mark);
        }

        return lowest;
    }

    // Calculate percentage
    double calculatePercentage() {
        int total = calculateTotal();
        int maximumMarks = marks.length * 100;

        return ((double) total / maximumMarks) * 100;
    }

    // Determine grade
    String determineGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    // Determine pass or fail
    String getResult() {
        return calculatePercentage() >= 50 ? "PASS" : "FAIL";
    }

    // Performance remark
    String getRemark() {
        String grade = determineGrade();

        switch (grade) {
            case "A+":
                return "Outstanding Performance";
            case "A":
                return "Excellent Performance";
            case "B":
                return "Very Good Performance";
            case "C":
                return "Good Performance";
            case "D":
                return "Satisfactory Performance";
            default:
                return "Needs Improvement";
        }
    }

    // Display student details
    void displayDetails() {
        String formattedName = studentName.trim().toUpperCase();

        double percentage = calculatePercentage();

        // Math.round() used to round percentage to 2 decimal places
        double roundedPercentage =
                Math.round(percentage * 100.0) / 100.0;

        System.out.println("\nSTUDENT PERFORMANCE REPORT");
        System.out.println("Roll Number       : " + rollNumber);
        System.out.println("Student Name      : " + formattedName);
        System.out.println("Name Length       : " + formattedName.length());

        System.out.println("Marks             : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + "          : " + marks[i]);
        }

        System.out.println("Total Marks       : " + calculateTotal());
        System.out.println("Average Marks     : " + calculateAverage());
        System.out.println("Highest Marks     : " + findHighest());
        System.out.println("Lowest Marks      : " + findLowest());
        System.out.println("Percentage        : " + roundedPercentage + "%");
        System.out.println("Grade             : " + determineGrade());
        System.out.println("Result            : " + getResult());
        System.out.println("Performance       : " + getRemark());

        
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        int[] marks = new int[5];

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student student = new Student(rollNumber, studentName, marks);

        student.displayDetails();

        sc.close();
    }
}
Enter Roll Number: 101
Enter Student Name: Anitha Sharma
Enter marks for 5 subjects:
Subject 1: 85
Subject 2: 92
Subject 3: 78
Subject 4: 88
Subject 5: 76

STUDENT PERFORMANCE REPORT
Roll Number       : 101
Student Name      : ANITHA SHARMA
Name Length       : 12
Marks             :
Subject 1          : 85
Subject 2          : 92
Subject 3          : 78
Subject 4          : 88
Subject 5          : 76
Total Marks       : 419
Average Marks     : 83.8
Highest Marks     : 92
Lowest Marks      : 76
Percentage        : 83.8%
Grade             : A
Result            : PASS
Performance       : Excellent Performance

