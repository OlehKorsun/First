public class Czestotliwosc {
    public static void main(String[] args) {
        int[] tabl = {1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 5};

        int maxIl = 0, ilosc = 1, wrt = tabl[0];

        for(int i = 0; i<tabl.length-1; i++){
            if(tabl[i] == tabl[i+1]){
                ilosc++;
            } else {
                ilosc = 1;
            }
            if(maxIl<ilosc) {
                maxIl = ilosc;
                wrt = tabl[i];
            }
        }
        System.out.println(wrt + " razy " + maxIl);
    }
}
