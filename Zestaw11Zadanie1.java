public class Zestaw11Zadanie1 {
    public static void main(String[] args) {
        int[] tabl = {2, 4, 5, 7, 6};
        System.out.println("Parzystych: " + countEven(tabl, 0));
    }
    public static int countEven(int[] tabl, int a){

        if(a>=tabl.length)
            return 0;

        int parzysty = tabl[a]%2==0? 1:0;

        int parzysteWPodTablicy = countEven(tabl, a+1);

        return parzysty + parzysteWPodTablicy;
    }
}
