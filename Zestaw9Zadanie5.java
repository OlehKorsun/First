import java.util.Arrays;

public class Zestaw9Zadanie5 {
    public static void main(String[] args) {
        int[][] tabl = {
                {1, 2, 3, 0, 5, 6},
                {1, 0, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},                    // mozna tez zrobic przy pomocy dwoch tablic typu Boolean
                {1, 2, 3, 4, 5, 6},
                {1, 0, 1, 2, 1, 0}
        };
        setZeros(tabl);
    }

    public static void setZeros(int[][] tabl){
        int[] a = new int[tabl.length];
        int[] b = new int[tabl[0].length];
        int ia=0, ib=0;

        for(int i = 0; i<tabl.length; i++){
            for(int j = 0; j<tabl[i].length; j++){
                if(tabl[i][j]==0){
                    a[ia]=i;
                    ia++;
                    b[ib]=j;
                    ib++;
                }
            }
        }

        for (int j = 0; j < a.length && j<ib; j++) {
            for(int i = 0; i< tabl.length; i++) {
                tabl[i][b[j]] = 0;
            }
        }

        for(int i = 0; i<a.length && i < ia; i++){
            for(int j = 0; j<tabl[i].length; j++){
                tabl[a[i]][j] = 0;
            }
        }
        print(tabl);
    }

    public static void print (int[][] tabl){
        for(int i = 0; i<tabl.length; i++){
            for(int j = 0; j<tabl[i].length; j++){
                System.out.print(tabl[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
