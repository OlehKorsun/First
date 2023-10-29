import java.util.Scanner;

public class Zadanie5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wprowadz znak");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		// Суть задания: Проверить являются ли введённые два числа одинаковыми с точностью до двух знаков после запятой
		if(a-b<0.01 && a-b>-0.01) {
			System.out.println("Tak");
		} else System.out.println("Nie");
		
	}
}
