import java.util.Arrays;

public class Zestaw10Zadanie2 {
    public static void main(String[] args) {
        String[][] arr = {
                        {"Germany",  "2", "Scotland", "1"},
                        {"Poland",   "2", "Germany",  "0"},
                        {"Germany",  "1", "Ireland",  "1"},
                        {"Poland",   "2", "Scotland", "2"},
                        {"Scotland", "1", "Ireland",  "0"},
                        {"Ireland",  "1", "Poland",   "1"},
                        {"Ireland",  "1", "Scotland", "1"},
                        {"Germany",  "3", "Poland",   "1"},
                        {"Scotland", "2", "Germany",  "3"},
                        {"Ireland",  "1", "Germany",  "0"},
                        {"Scotland", "2", "Poland",   "2"},
                        {"Poland",   "2", "Ireland",  "1"} };

        System.out.println(Arrays.toString(fun(arr)));

    }

    public static int swicz(String country){
        int i;
        switch(country){
            case "Germany" -> i = 0;
            case "Ireland" -> i = 1;
            case "Poland" -> i = 2;
            default -> i=3;
        }
        return i;
    }

    public static int[] fun(String[][] tabl){
        int[] tabl2 = new int[4];

        for(int i = 0; i<tabl.length; i++){

            int p = Integer.parseInt(tabl[i][3]);
            int l = Integer.parseInt(tabl[i][1]);

            if(l>p){
                tabl2[swicz(tabl[i][0])] +=3;
            } else if(l<p){
                tabl2[swicz(tabl[i][2])] +=3;
            } else if(l==p){
                tabl2[swicz(tabl[i][0])] +=1;
                tabl2[swicz(tabl[i][2])] +=1;
            }
        }
        return tabl2;
    }
}