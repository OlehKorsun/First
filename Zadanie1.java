import java.util.Scanner;

public class Zadanie1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wprowadz wrtosc");
		int x = scan.nextInt();
		
		boolean a = x>-15 && x<=-10 || x>-5 && x<0 || x>5 && x<10;
		boolean b = x<=-13 || x>-8 && x<=-3;
		boolean c = x>=-4;
		
		boolean odp = a && b && c;
		if(odp) System.out.println("Nalezy");
		else System.out.println("Nie nalezy");
	}
}