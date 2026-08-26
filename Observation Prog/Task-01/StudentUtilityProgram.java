package javacore;
import java.util.Scanner;

public class StudentUtilityProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Part 1");
        System.out.println("2. Part 2");
        System.out.println("3. Part 3");
        System.out.println("4. Part 4");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            // ================= PART 1 =================
            case 1:
                System.out.print("Enter case 1-4: ");
                int achoice = sc.nextInt();

                String name;
                int rollno;
                double marks1, marks2, marks3, total, percentage;

                switch (achoice) {

                    // Case 1: Student Information
                    case 1:
                        System.out.println("Student Information");
                        System.out.println("Name : Lalitha");
                        System.out.println("Roll No : 101");
                        break;

                    // Case 2: Enter Student Details
                    case 2:
                        sc.nextLine(); // Clear newline

                        System.out.print("Enter Student Name: ");
                        name = sc.nextLine();

                        System.out.print("Enter Roll Number: ");
                        rollno = sc.nextInt();

                        System.out.print("Enter English Marks: ");
                        marks1 = sc.nextDouble();

                        System.out.print("Enter Maths Marks: ");
                        marks2 = sc.nextDouble();

                        System.out.print("Enter Social Marks: ");
                        marks3 = sc.nextDouble();

                        break;

                    // Case 3: Calculate Total and Percentage
                    case 3:
                        System.out.print("Enter English Marks: ");
                        marks1 = sc.nextDouble();

                        System.out.print("Enter Maths Marks: ");
                        marks2 = sc.nextDouble();

                        System.out.print("Enter Social Marks: ");
                        marks3 = sc.nextDouble();

                        total = marks1 + marks2 + marks3;
                        percentage = (total / 300) * 100;

                        System.out.println("Total = " + total);
                        System.out.println("Percentage = " + percentage);
                        break;

                    // Case 4: Complete Student Result
                    case 4:
                        sc.nextLine(); // Clear newline

                        System.out.print("Enter Student Name: ");
                        name = sc.nextLine();

                        System.out.print("Enter Roll Number: ");
                        rollno = sc.nextInt();

                        System.out.print("Enter English Marks: ");
                        marks1 = sc.nextDouble();

                        System.out.print("Enter Maths Marks: ");
                        marks2 = sc.nextDouble();

                        System.out.print("Enter Social Marks: ");
                        marks3 = sc.nextDouble();

                        total = marks1 + marks2 + marks3;
                        percentage = (total / 300) * 100;

                        System.out.println("\n----- RESULT -----");
                        System.out.println("Name : " + name);
                        System.out.println("Roll No : " + rollno);
                        System.out.println("Total : " + total);
                        System.out.println("Percentage : " + percentage);
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }
                break;


            // ================= PART 2 =================
            case 2:
                System.out.print("Enter case 1-4: ");
                int bchoice = sc.nextInt();

                switch (bchoice) {

                    // Case 1: Even or Odd
                    case 1:
                        System.out.print("Enter a number: ");
                        int n = sc.nextInt();

                        if (n % 2 == 0)
                            System.out.println("Even Number");
                        else
                            System.out.println("Odd Number");

                        break;

                    // Case 2: Greatest of Three Numbers
                    case 2:
                        System.out.print("Enter first number: ");
                        int a = sc.nextInt();

                        System.out.print("Enter second number: ");
                        int b = sc.nextInt();

                        System.out.print("Enter third number: ");
                        int c = sc.nextInt();

                        if (a >= b && a >= c)
                            System.out.println("Largest = " + a);
                        else if (b >= a && b >= c)
                            System.out.println("Largest = " + b);
                        else
                            System.out.println("Largest = " + c);

                        break;

                    // Case 3: Grade
                    case 3:
                        System.out.print("Enter percentage: ");
                        double per = sc.nextDouble();

                        if (per >= 90)
                            System.out.println("Grade A");
                        else if (per >= 75)
                            System.out.println("Grade B");
                        else if (per >= 60)
                            System.out.println("Grade C");
                        else if (per >= 40)
                            System.out.println("Grade D");
                        else
                            System.out.println("Fail");

                        break;

                    // Case 4: Day of the Week
                    case 4:
                        System.out.print("Enter day number (1-7): ");
                        int day = sc.nextInt();

                        switch (day) {
                            case 1:
                                System.out.println("Monday");
                                break;
                            case 2:
                                System.out.println("Tuesday");
                                break;
                            case 3:
                                System.out.println("Wednesday");
                                break;
                            case 4:
                                System.out.println("Thursday");
                                break;
                            case 5:
                                System.out.println("Friday");
                                break;
                            case 6:
                                System.out.println("Saturday");
                                break;
                            case 7:
                                System.out.println("Sunday");
                                break;
                            default:
                                System.out.println("Invalid Day");
                        }

                        break;

                    default:
                        System.out.println("Invalid Choice");
                }
                break;


            // ================= PART 3 =================
            case 3:
                System.out.print("Enter case 1-4: ");
                int cchoice = sc.nextInt();

                switch (cchoice) {

                    // Case 1: Multiplication Table
                    case 1:
                        System.out.print("Enter a number: ");
                        int num = sc.nextInt();

                        System.out.println("Multiplication Table:");

                        for (int i = 1; i <= 10; i++) {
                            System.out.println(num + " x " + i + " = " + (num * i));
                        }

                        break;

                    // Case 2: Numbers from 1 to N
                    case 2:
                        System.out.print("Enter N: ");
                        int n = sc.nextInt();

                        System.out.println("Numbers from 1 to " + n + ":");

                        for (int i = 1; i <= n; i++) {
                            System.out.print(i + " ");
                        }

                        System.out.println();
                        break;

                    // Case 3: Sum of N Numbers
                    case 3:
                        System.out.print("Enter N: ");
                        int m = sc.nextInt();

                        int sum = 0;

                        for (int i = 1; i <= m; i++) {
                            sum = sum + i;
                        }

                        System.out.println("Sum = " + sum);
                        break;

                    // Case 4: Fibonacci Series
                    case 4:
                        System.out.print("Enter number of terms: ");
                        int terms = sc.nextInt();

                        int a = 0;
                        int b = 1;
                        int c;

                        System.out.println("Fibonacci Series:");

                        for (int i = 1; i <= terms; i++) {
                            System.out.print(a + " ");

                            c = a + b;
                            a = b;
                            b = c;
                        }

                        System.out.println();
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }
                break;


            // ================= PART 4 =================
            case 4:
                System.out.print("Enter case 1-4: ");
                int dchoice = sc.nextInt();

                switch (dchoice) {

                    // Case 1: Factorial
                    case 1:
                        System.out.print("Enter a number: ");
                        int n = sc.nextInt();

                        int fact = 1;

                        for (int i = 1; i <= n; i++) {
                            fact = fact * i;
                        }

                        System.out.println("Factorial = " + fact);
                        break;

                    // Case 2: Prime Number
                    case 2:
                        System.out.print("Enter a number: ");
                        int num = sc.nextInt();

                        int count = 0;

                        for (int i = 1; i <= num; i++) {
                            if (num % i == 0) {
                                count++;
                            }
                        }

                        if (count == 2)
                            System.out.println("Prime Number");
                        else
                            System.out.println("Not a Prime Number");

                        break;

                    // Case 3: Maximum of Two Numbers
                    case 3:
                        System.out.print("Enter first number: ");
                        int a = sc.nextInt();

                        System.out.print("Enter second number: ");
                        int b = sc.nextInt();

                        if (a > b)
                            System.out.println("Maximum = " + a);
                        else
                            System.out.println("Maximum = " + b);

                        break;

                    // Case 4: Area of Circle
                    case 4:
                        System.out.print("Enter radius: ");
                        double r = sc.nextDouble();

                        double area = 3.14 * r * r;

                        System.out.println("Area of Circle = " + area);
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }
                break;


            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}


1. Part 1
2. Part 2
3. Part 3
4. Part 4
Enter your choice: 1
Enter case 1-4: 1
Student Information
Name : Lalitha
Roll No : 101
Enter your choice: 1
Enter case 1-4: 2
Enter Student Name: Ramesh
Enter Roll Number: 101
Enter English Marks: 80
Enter Maths Marks: 90
Enter Social Marks: 85
Enter your choice: 1
Enter case 1-4: 3
Enter English Marks: 80
Enter Maths Marks: 90
Enter Social Marks: 85
Total = 255.0
Percentage = 85.0
Enter your choice: 1
Enter case 1-4: 4
Enter Student Name: Reshma
Enter Roll Number: 101
Enter English Marks: 80
Enter Maths Marks: 90
Enter Social Marks: 85

----- RESULT -----
Name : Reshma
Roll No : 101
Total : 255.0
Percentage : 85.0
Enter your choice: 2
Enter case 1-4: 1
Enter a number: 10
Even Number
Enter your choice: 2
Enter case 1-4: 2
Enter first number: 10
Enter second number: 25
Enter third number: 15
Largest = 25
Enter your choice: 2
Enter case 1-4: 3
Enter percentage: 85
Grade B
Enter your choice: 2
Enter case 1-4: 4
Enter day number (1-7): 3
Wednesday
Enter your choice: 3
Enter case 1-4: 1
Enter a number: 5
Multiplication Table:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
Enter your choice: 3
Enter case 1-4: 2
Enter N: 5
Numbers from 1 to 5:
1 2 3 4 51. 
Enter your choice: 3
Enter case 1-4: 3
Enter N: 5
Sum = 15
Enter your choice: 3
Enter case 1-4: 4
Enter number of terms: 7
Fibonacci Series:
0 1 1 2 3 5 8
Enter your choice: 4
Enter case 1-4: 1
Enter a number: 5
Factorial = 120
Enter your choice: 4
Enter case 1-4: 2
Enter a number: 7
Prime Number
Enter your choice: 4
Enter case 1-4: 3
Enter first number: 25
Enter second number: 40
Maximum = 40
Enter your choice: 4
Enter case 1-4: 4
Enter radius: 5
Area of Circle = 78.5
