import java.util.Scanner;
public class Areaofrectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height");
		double height = sc.nextDouble();
		System.out.println("Enter Width");
		double width = sc.nextDouble();
		if(height<0 || width<0){
			System.out.println("invalid");
		}
		else {
		System.out.println("Area=" + height*width);
	    }
		sc.close();
	}
}