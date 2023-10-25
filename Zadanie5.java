import java.util.Scanner;

public class Zadanie5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wprowadz znak");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		
		if(a-b<0.01 && a-b>-0.01) {
			System.out.println("Tak");
		} else System.out.println("Nie");
		
	}
}