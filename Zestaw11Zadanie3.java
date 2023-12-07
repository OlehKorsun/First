import java.util.Arrays;

public class Zestaw11Zadanie3 {
    public static void main(String[] args) {
        int[] tabl = {0, 1, 1, 2, 5, 10};
        System.out.println(Arrays.toString(aad(tabl, 3)));
        System.out.println(Arrays.toString(delIndex(tabl, 4)));

    }

    static int[] aad(int[] a, int elem){
        int tabl[] = new int[a.length+1];
        boolean bool = false;
        for(int i = 0, j=0; i<a.length && j<tabl.length; i++, j++){
            if(elem<a[i] && !bool){
                tabl[j]=elem;
                i--;
                bool = true;
            } else tabl[j] = a[i];

            if(i==a.length-1 && !bool) {
                j++;
                tabl[j] = elem;
            }
        }
        return tabl;
    }

    static int[] delIndex(int[] a, int ind){
        int[] tabl = new int[a.length-1];
        if(ind>=a.length)
            return a;

        for(int i = 0, j=0; i<tabl.length && j<a.length; i++, j++){
            if(i!=ind)
                tabl[i]=a[j];
            else {
                j++;
                tabl[i] = a[j];
            }
        }
        return tabl;
    }
}
