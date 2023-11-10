import java.util.Scanner;

public class GwiazdyX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Wprowadz wysokosc litery: ");
        int n = scan.nextInt();

        if(n<3 || n%2==0){
            System.out.println("Nieprawidlowe dane!");
            return;
        }

        int a = 1, b = 1, c = 2;

        for(int i = 0; i<(n/2); i++){
            System.out.print(" ".repeat(i));
            System.out.print("*");
            for( int j = 0; j<n-c; j++){
                System.out.print(" ");
            }
            c+=2;
            System.out.print("*" + "\n");
        }

    }
}
