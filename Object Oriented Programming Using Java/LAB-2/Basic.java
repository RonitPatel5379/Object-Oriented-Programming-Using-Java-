import java.util.Scanner;
public class Basic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		double a = sc.nextDouble();
		System.out.println("Enter b");
		double b = sc.nextDouble();
		String str = sc.next();
		if(str.equals("addition")) {
			System.out.println("Add=" + (a+b));
		}
		else if(str.equals("subtraction")) {
			System.out.println("Sub=" + (a-b));
		}
		else if(str.equals("Multiplication")) {
			System.out.println("Mul="+ (a*b));
		}
		else if(str.equals("Division")) {
			System.out.println("Div=" + (a/b));
		}
		else {
			System.out.println("Invalid Operation");
		}
		sc.close();
	}
}