import java.util.Scanner;
public class Prime {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n:");
		int n= sc.nextInt();
		int i=2;
		int isPrime=1;
		if(n<=1) {
			isPrime=0;
		}
		else {
			while(i<=n/2) {
				if(n%i==0) {
					isPrime=0;
				}
				i++;
			}
		}
		if(isPrime==1) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
		sc.close();
	}
}