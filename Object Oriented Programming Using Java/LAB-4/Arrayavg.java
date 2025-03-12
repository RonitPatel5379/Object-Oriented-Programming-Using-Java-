import java.util.Scanner;
public class Arrayavg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] a= new int[n];
		double sum=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		double avg=sum/n;
		System.out.println("Average="+avg);
		sc.close();
	}
}