import java.util.Scanner;

public class Gwiazdy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Wprowadz liczbe nieparzysta: ");
        int n = scan.nextInt();

        if(n<0 || n%2==0) {
            System.out.println("Blad!");
            return;
        }

        int j = 0, i = 0;
        int c = n;

        for(; i<=n; i++){
            if(i==n){
                System.out.println();
                i=0;
                n-=1;
                j++;
                for(int g = j ; g>0 ; g--){
                    System.out.print(" ");
                    i++;
                }
            }
            if(!(n==(c/2))) {
                System.out.print("*");
            }
        }
    }
}
