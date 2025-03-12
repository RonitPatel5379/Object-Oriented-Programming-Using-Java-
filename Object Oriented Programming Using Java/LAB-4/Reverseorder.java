import java.util.Scanner;
public class Reverseorder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] marks = new int[5];
        System.out.println("Enter the marks of 4 subjects: ");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("Normal Order");
        for(int i=0;i<5;i++) {
        	System.out.println(marks[i]);
        }
        System.out.println("Reverse Order");
        for(int i=4;i>=0;i--) {
        	System.out.println(marks[i]);
        }
        sc.close();
    }
}