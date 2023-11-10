import java.util.Scanner;

public class Przedzialy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Wprowadz a: ");
        int a = scan.nextInt();

        System.out.print("Wprowadz b: ");
        int b = scan.nextInt();

        System.out.print("Wprowadz c: ");
        int c = scan.nextInt();

        System.out.print("Wprowadz d: ");
        int d = scan.nextInt();
        close.scan;
        boolean inSum, inIntersect, inSumDiff;

        for(int n = -5; n<6; n++){
            inSum = n>=a && n<=b || n>=c && n<=d;
            inIntersect = n>=a && n<=b && n>=c && n<=d;
            //inSumDiff = n>=a && n<=b && n<=c || n>=c && n<=d && n>=b;
            inSumDiff = n>=a && n<=b ^ n>=c && n<=d;
            System.out.println(n + ": InSum? " + inSum + "; inIntersect? " + inIntersect + " ; inSymDiff? " + inSumDiff);
        }
    }
}
