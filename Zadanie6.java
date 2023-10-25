import java.util.Scanner;

public class Zadanie6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wprowadz katy");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		if(a<0 || b<0 || c<0) {
			System.out.println("Nieprawidlowe dane");
			return;
		}
		boolean trojkat = (180-(a+b+c))>-0.001 && (180-(a+b+c))< 0.001;
		if(trojkat) {
			System.out.println("Takij trojkat istnieje");
			if(a<90&&b<90&&c<90) System.out.println("Ostrokatny");
			else System.out.println("Tupokatny");
		} else {
			System.out.println("Takiego nie istnieje");
			return;
		}
	}
}