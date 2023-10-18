import java.util.Scanner;

public class Zadanie6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		int max, min;
		int imax = 0;
		int imin = 0;
		
		if(a==0) {
			System.out.println("Inna liczba");
			return;
		}
		
			max = a;
			imax = 1;
			min = a;
			imin = 1;
		
		while(a!=0){
			if(a>max) {
				max = a;
				imax = 1;
			} else if (a == max) {
				imax = imax + 1;
			} else if (a<min) {
				min = a;
				imin = 1;
			} else if(a == min){
				imin = imin + 1;
			}
			Scanner scan1 = new Scanner(System.in);
			a = scan1.nextInt();
		}
		if(a==0) {
			System.out.println("Max: " + max + " " + imax " Razy");
			System.out.println("Min: " + min + " " + imin " Razy");
			return; 
		}
	}
}
