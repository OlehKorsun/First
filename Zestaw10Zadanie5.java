import java.util.Arrays;

public class Zestaw10Zadanie5 {
    public static void main(String[] args) {
        int[][] tabl = {
                {1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 6, 7},
                {3, 4, 5, 6, 7, 8},
                {4, 5, 6, 7, 8, 9}
        };

        System.out.println(Arrays.deepToString(fun(tabl)));
    }

    public static int[][] fun(int[][] tabl){
        int[][] tabl2 = new int[tabl[0].length][tabl.length];

        for(int i = 0; i< tabl2.length; i++){
            for(int j = 0; j<tabl2[i].length; j++){
                tabl2[i][j] = tabl[j][i];
            }
        }
        return tabl2;
    }
}
