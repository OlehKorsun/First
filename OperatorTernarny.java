import java.util.Scanner;

public class OperatorTernarny {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scan.nextInt();

        System.out.println("Enter b: ");
        int b = scan.nextInt();
        scan.close();

        String s1, s2;

        if(a==b) {
            s1 = "=";
            s2 = "=";
        } else if(a>b){
            s1 = "!=";
            s2 = ">";
        } else {
            s1 = "!=";
            s2 = "<";
        }
        System.out.println(a + s1 + b);
        System.out.println(a + s2 + b);
    }
}
