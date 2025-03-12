import java.util.Scanner;
public class Primerange {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter Staring number");
        int start = sc.nextInt();
        System.out.println("Enter Endding number");
        int end = sc.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
		sc.close();
    }
    public static boolean isPrime(int n) {  
        if (n <= 1) {
        	return false;
        } 
        for (int i = 2; i <=Math.sqrt(n); i++) { 
            if (n % i == 0) {
            	return false;
            } 
        }
        return true; 
    }
}