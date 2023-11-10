import java.util.Scanner;

public class GwiazdyProstokat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz szerokosc: ");
        int w = scan.nextInt();

        System.out.println("Wprowadz wysokosc: ");
        int h = scan.nextInt();

        if(w<0 || h<0){
            System.out.println("Nieprawidlowe dane!");
            return;
        }
        for(int a = 1 ; a<=h; a++) {
            if(a==1 || a==h){
                for(int i = 0; i<w; i++){
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.print("*");
                for(int i = 1; i<w-1; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
