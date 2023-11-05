import java.util.Scanner;

public class Formuly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Wprowadz liczbe a: ");
        double a = scan.nextDouble();
        if(a<0) {
            System.out.println("Blond!");
            return;
        }
        System.out.print("Wprowadz figure: ");
        String b = scan.next();
        scan.close();
        double area = 0;

        switch(b) {
            case "disc" -> area = a*a*3.14;
            case "triangle" -> area = (a*a*1.732)/4;
            case "square" -> area = a*a;
            case "rand" -> {
                int c = (int) (Math.random()*3)+1;
                switch (c) {
                    case 1 -> {
                        System.out.println("Figura - disc");
                        area = a*a*3.14;
                    }
                    case 2 -> {
                        System.out.println("Figura - triangle");
                        area = (a*a*1.732)/4;
                    }
                    case 3 -> {
                        System.out.println("Figura - square");
                        area = a*a;
                    }
                }
            }
            default -> System.out.println("Nie wiem co to jest");
        }
        System.out.println("Powierzchnia figury: " + area);
    }
}
