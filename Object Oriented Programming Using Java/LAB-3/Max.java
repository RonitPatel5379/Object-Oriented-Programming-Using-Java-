import java.util.Scanner;
public class Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		System.out.println("Enter c");
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("max="+a);
		}
		else if(b>c && b>a) {
			System.out.println("max="+b);
		}
		else {
			System.out.println("max="+c);
		}
		sc.close();
	}
}