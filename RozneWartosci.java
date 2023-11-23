public class RozneWartosci {
    public static void main(String[] args) {
        int[] tabl = {1, 2, 2, 3, 3, 3, 4, 4, 5};
        int ilosc = 1;

        for(int i = 1; i<tabl.length; i++){
            if(tabl[i]!=tabl[i-1]){
                ilosc++;
                System.out.print(tabl[i] + ", ");
            }

        }
        System.out.println();
        System.out.print(ilosc);
    }
}
