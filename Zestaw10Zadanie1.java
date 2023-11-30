import java.util.Arrays;

public class Zestaw10Zadanie1 {
    public static void main(String[] args) {
        int[][] tabl = { {1, 2, 3, 4, 5}, {1, 9}, {3, 1, 8} };
        System.out.println(Arrays.toString(fun(tabl)));

    }

    public static int[] fun(int[][] tabl){

        int[] a = new int[2];

        for(int i = 0; i<tabl.length; i++){
            for(int j = 0; j<tabl[i].length; j++){
                if(tabl[i][j]%2 == 0){
                    a[0]++;
                } else a[1]++;
            }
        }
        return a;
    }
}
