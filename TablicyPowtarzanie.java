package Tablicy;

public class TablicyPowtarzanie {
    public static void main(String[] args) {
        int[] tabl = {2, 5, 3, 2, 1, 3, 6, 5, 3, 10, 10, 10, 2, 5, 8};
        boolean bool = false;

        for(int i = 0; i<tabl.length; i++){
            bool = false;
            for(int j = 0; j<i; j++){
                if(tabl[i]==tabl[j]) bool=true;
            }
            if(!bool) System.out.print(tabl[i] + " ; ");
        }
    }
}
