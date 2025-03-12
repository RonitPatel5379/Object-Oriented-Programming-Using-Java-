import java.util.Scanner;
public class Countconsonantvowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str= sc.nextLine();
		int vcount=0;
		int ccount=0;
		// int space=0;
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vcount++;
			}
			// else if(ch==' ') {
			// 	space++;
			// }
			else {
				ccount++;
			}
		}
		System.out.println("Vowel="+vcount);
		System.out.println("Consont="+ccount);
		sc.close();
	}
}