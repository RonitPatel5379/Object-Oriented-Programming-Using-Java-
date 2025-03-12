import java.util.Scanner;
public class Fahrenheittocelsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Temperature in Fahrenheit");
		double fahrenheit = sc.nextDouble();
		double celsius = ((fahrenheit-32)*5)/9;
		System.out.println("celsius=" + celsius);
		sc.close();
	}
}