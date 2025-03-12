import java.util.Scanner;
public class Metertofeet {
	public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter meter");
        int meter=sc.nextInt();
        //int feet=sc.nextInt();
        System.out.println("feet = " + meter*3.281f);
        sc.close();
	} 
}