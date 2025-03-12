import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int revnum=0;
		int actnum=n;
		while(n!=0) {
			revnum=revnum*10 + n%10;
			n=n/10;
		}
		if(actnum==revnum) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not Palindrome Number");
		}
		sc.close();
	}
}