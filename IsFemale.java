import java.util.Scanner;

public class IsFemale {
    public static void main (String[] args) {
        boolean isFemale, isYoung;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz swoja plec (M or F)");
        String a = scan.next();

        if(a.equals("M")){
            isFemale = false;
        } else if(a.equals("F")){
            isFemale = true;
        } else{
            System.out.println("Nieprawidlowe dane");
            return;
        }

        System.out.println("Wprowadz swoj wiek: ");
        int b = scan.nextInt();

        if(b>0 && b<18){
            isYoung = true;
        } else if(b>=18 && b<=100) {
            isYoung = false;
        } else{
            System.out.println("Nieprawidlowe dane");
            return;
        }
        if(isFemale && isYoung){
            System.out.println("Girl");
        } else if(isFemale && !isYoung){
            System.out.println("Woman");
        } else if(!isFemale && isYoung){
            System.out.println("Boy");
        } else if(!isFemale && !isYoung){
            System.out.println("Man");
        }
    }
}
