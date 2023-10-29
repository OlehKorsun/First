import java.util.Scanner;

public class Zadanie3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wprowadz lizby");
		int mies = scan.nextInt();
		if(mies>12 || mies<1) {
			System.out.println("Nieprawidlowe dane");
			return;
		}
		int rok = scan.nextInt();
		if(rok<1) {
			System.out.println("Nieprawidlowe dane");
			return;
		}
		// суть Задания: ввести месяц и год, а зетем посчитать сколько дней имеет заданный месяц в заданном году
		if(mies==1 || mies==3 || mies==5 || mies ==7 || mies==8 || mies==10 || mies==12){
			System.out.println("Ten miesiac ma 31 dzien");
			return;
		} else if(mies==4 || mies==6 || mies==9 || mies==11) {
			System.out.println("Ten miesiac ma 30 dni");
			return;
		} else {
			if(rok%400==0) {
				System.out.println("Ten miesiac ma 29 dni");
				return;
			} else if(rok%100==0) {
				System.out.println("Ten miesiac ma 28 dni");
				return;
			} else if (rok%4==0){
				System.out.println("Ten miesiac ma 29 dni");
				return;
			} else {
				System.out.println("Ten miesiac ma 28 dni");
				return;
			}
		}
	}
}
