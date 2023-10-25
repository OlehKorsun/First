import java.util.Scanner;

public class Zadanie4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wprowadz znak");
		String ch = scan.next().substring(0,1); // substring - wybieraju znaki od pierwogo wkluczitelno do wtorogo wykluczitelno
		
		if("eyuioa".contains(ch)) {            //contains - soderzyt li pieremennaja ch bukwy, napisannyje slewa?
			System.out.println("Samogloska");
		} else if("wrtpsdfghjklzcbnm".contains(ch)) {
			System.out.println("Spolgloska");
		} else System.out.println("Nieprawidlowe dane");
	}
}