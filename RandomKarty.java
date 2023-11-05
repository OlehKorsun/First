public class RandomKarty {
    public static void main(String[] args) {
        String kolor, nazwa;
        int kol = (int) (Math.random() * 4) + 1;
        int naz = (int) (Math.random() * 12) + 2;

        switch (kol) {
            case 1 -> kolor = "Trefl";
            case 2 -> kolor = "Karo";
            case 3 -> kolor = "Kier";
            case 4 -> kolor = "Pik";
            default -> kolor = "?";
        }
        switch (naz) {
            case 2 -> nazwa = "Dwojka";
            case 3 -> nazwa = "Trojka";
            case 4 -> nazwa = "Czworka";
            case 5 -> nazwa = "Piatka";
            case 6 -> nazwa = "Szustka";
            case 7 -> nazwa = "Siudemka";
            case 8 -> nazwa = "Osemka";
            case 9 -> nazwa = "Dziewiatka";
            case 10 -> nazwa = "Dziesiatka";
            case 11 -> nazwa = "Walet";
            case 12 -> nazwa = "Dama";
            case 13 -> nazwa = "Krol";
            case 14 -> nazwa = "As";
            default -> nazwa = "?";
        }
        System.out.println("Twoja karta: " + nazwa + " " + kolor);
    }
}
