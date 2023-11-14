public class Tablicy2 {
    public static void main(String[] args) {


        char[] tabl = {'.', '!', '/'};
        int min = tabl[0];
        for(int i = 0; i<tabl.length; i++){      //prowieraju kakoj znak naimniejszyj
            if(min<tabl[i]){
                min = i;
            }
        }
        System.out.println(min);





        char[] tablica = new char[5];
        int razy = 0;
        for(int i = 0; i<tablica.length; i++) {
            char c = (char) ('A' + (int) (Math.random() * 26)); //A = 65    //char + char = int
            tablica[i] = c;
            System.out.print(tablica[i] + " ; ");
        }
        java.util.Scanner in = new java.util.Scanner(System.in);
        int zera = 0;
        boolean b = zera<tablica.length;   // Sozdaju tablicu randomno i wwożu symbol, jesli takoj jest, zamienaju na 0 i piszu skolko raz on popalsia
        while(b){
            char g = in.next().charAt(0);
            for(int i = 0; i<tablica.length; i++){
                if(g==tablica[i]){
                    tablica[i]=0;
                    zera++;
                    razy++;
                }
            }
            System.out.println(g + " razy: " + razy);
            razy=0;
            b = zera<tablica.length;
        }
    }
}
