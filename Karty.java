public class Karty {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++) {
            int kolor = (int) (Math.random()*4)+1;
            int numer = (int) (Math.random()*13)+2;

            String kol = switch (kolor){  // sprawdzamy typ
                case 1 -> "Trefl";
                case 2 -> "Karo";
                case 3 -> "Kier";
                default -> "Pik";
            };
            
            String rank = switch(numer) {  // sprawdzamy numer
                case 2 -> "Dwojka";
                case 3 -> "Trojka";
                case 4 -> "Czworka";
                case 5 -> "Piatka";
                case 6 -> "Szustka";
                case 7 -> "Siudemka";
                case 8 -> "Usemka";
                case 9 -> "Dziewiatka";
                case 10 -> "Dziesiatka";
                case 11 -> "Walet";
                case 12 -> "Dama";
                case 13 -> "Krol";
                default -> "As";
            };
            
            System.out.println("Twoja karta to: "rank + " " + kol);
        }
    }
}
