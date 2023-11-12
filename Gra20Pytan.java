import java.util.Scanner;

public class Gra20Pytan {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 1, b = 1000000;
        int n = (a+b)/2;
          
         for(int i = 1; i<20; i++) {
             System.out.println("Czy jest to n? " + n);
             String odpowiedz = scan.next();
             if (odpowiedz.equals("y")) {
                 System.out.println("Pomyslna liczba to: " + n);
                 return;
             } else if (odpowiedz.equals("b")) {
                 b = n;
                 n = (a+b)/2;
             } else if (odpowiedz.equals("s")) {
                 a = n;
                 n = (a+b)/2;
             } else {
                 System.out.println("Nieprawidlowa odpowiedz");
             }
         }
         System.out.println("Nie udalo mi sie :_(");
    }
}
