import java.util.Arrays;

public class Zestaw9Zadanie3 {
    public static void main(String[] args) {
        int[][] tabl1 = { {5, 1, 2}, {4, 8, 3, 4}, {12, 8, 4, 1, 8}, {10}, {10, 9, 4}};
        System.out.println(Arrays.toString(fun(tabl1)));
    }

    static int[] fun(int[][] tabl){
        int max=0, imax=0;

        int[] tabl2 = new int[tabl.length];

        for(int i = 0; i<tabl.length; i++){
            for(int j = 0; j<tabl[i].length-1; j++){

                if(tabl[i][j]>max) {
                    max = tabl[i][j];
                    imax=j;
                }
            }
            if(tabl[i].length==1){
                imax=0;
            }
            tabl2[i] = tabl[i][imax];
        }
        return tabl2;
    }
}
