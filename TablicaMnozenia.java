import java.util.Scanner;

public class TablicaMnozenia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Wprowadz liczbe n: ");
        int n = scan.nextInt();

        int a = 1, b = 1;

        for( ; b<=n; b++) {
            for (int i = 0; i < n; i++) {
                System.out.print(a * b + " ");
                a++;
            }
            System.out.println();
            a=1;
        }

    }
}
