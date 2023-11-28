import java.util.Arrays;

public class Zestaw9Cwiczenie1 {
    public static void main(String[] args) {
        int[][] tabl = new int[3][3];
        for(int i = 0; i< tabl.length; i++){
            for(int j = 0; j<tabl[i].length; j++){
                tabl[i][j] = (int)(Math.random()*100);
            }
        }
        System.out.println(Arrays.deepToString(tabl));

        int sum = 0;
        for(int i = 0; i< tabl.length; i++){
            sum += tabl[i][tabl[i].length-1];
        }
        System.out.println(sum);
    }
}
