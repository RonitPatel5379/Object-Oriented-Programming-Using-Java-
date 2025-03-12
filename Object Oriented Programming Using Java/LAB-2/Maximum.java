import java.util.Scanner;
public class Maximum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		System.out.println("Enter c");
		int c = sc.nextInt();
		int max = (a>b && a>c ? a:b>c ? b:c);
		System.out.println("max=" + max);
		sc.close();
	}
}