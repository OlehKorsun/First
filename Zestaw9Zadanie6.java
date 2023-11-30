import java.util.Arrays;
import java.util.Scanner;
public class Zestaw9Zadanie6 {
    public static void main(String[] args) {
        String[][] tabl = {
                {"Kenya", "Nairobi"}, {"Rwanda", "Kigali"},
                {"Gambia", "Banjul"}, {"Ghana", "Accra"},
                {"Niger", "Niamey"}, {"Zambia", "Lusaka"}
        };

        Scanner scan = new Scanner(System.in);
        String country = scan.next();
        boolean find = false;

        for(int i = 0; i<tabl.length; i++){
            if(country.equalsIgnoreCase(tabl[i][0])){
                System.out.println(tabl[i][1]);
                find = true;
            }
        }
        if(!find) System.out.println("Nie znam");
    }
}
