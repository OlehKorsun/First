import java.util.Arrays;

public class Zestaw10Zadanie4 {
    public static void main(String[] args) {
        int[][] tabl = {
                {1, 2, 3, 4, 5, 6, 7},
                {2, 3, 4, 5, 6, 7, 8},
                {3, 4, 5, 6, 7, 8, 9},
                {4, 5, 6, 7, 8, 9, 10},
                {5, 6, 7, 8, 9, 10, 11}
        };
        System.out.println(Arrays.deepToString(fun(tabl)));
    }
    public static int[][] fun(int[][] tabl){
        int[][] tabl2 = new int[tabl.length-2][tabl[0].length-2];
        for(int i = 0; i<tabl2.length; i++){
            for(int j = 0; j<tabl2[i].length; j++){
                tabl2[i][j] = tabl[i+1][j+1];
            }
        }
        return tabl2;
    }
    
}
