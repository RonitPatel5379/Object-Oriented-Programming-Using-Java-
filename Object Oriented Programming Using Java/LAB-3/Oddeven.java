import java.util.Scanner;
public class Oddeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		if((n & 1)==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		sc.close();
	}
}