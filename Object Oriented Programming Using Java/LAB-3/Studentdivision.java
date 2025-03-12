import java.util.Scanner;
public class Studentdivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int totalMarks = 0;
        System.out.println("Enter the marks for 5 subjects: ");
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        double percentage = (totalMarks / 5);
        if (percentage >= 60) {
            System.out.println("First Division");
        } else if (percentage >= 50) {
            System.out.println("Second Division");
        } else if (percentage >= 40) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }
        scanner.close();
    }
}