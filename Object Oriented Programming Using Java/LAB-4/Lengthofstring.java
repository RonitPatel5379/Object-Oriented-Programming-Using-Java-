import java.util.Scanner;
public class Lengthofstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		int length = str.length();
		System.out.println("Length of string is:"+length);
		int half=length/2;
		for(int i=half;i<length;i++) {
			char ch=str.charAt(i);
			System.out.print(ch);
		}
		sc.close();
	}
}