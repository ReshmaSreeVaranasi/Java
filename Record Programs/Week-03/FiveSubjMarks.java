import java.util.Scanner;

public class FiveSubjMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter Mark 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter Mark 5: ");
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}

Enter Mark 1: 80
Enter Mark 2: 75
Enter Mark 3: 90
Enter Mark 4: 85
Enter Mark 5: 70
Total = 400
Average = 80.0
