import java.util.Arrays;

public class Zestaw10Zadanie3 {
    public static void main(String[] args) {
        int[][][] tabl = {
                { {100, -50, 25}, {150, -300}, {300, -90, 100} },
                { {90, -60, 250}, {300, 20, -100} },
                { {20, 50}, {300}, {20, -20, 40}, {100, -200} }
        };

        int[] sum = new int[tabl.length];

        int s = 0;

        for(int i = 0; i<tabl.length; i++){
            for(int j = 0; j<tabl[i].length; j++){
                for(int g = 0; g<tabl[i][j].length; g++){
                    s += tabl[i][j][g];
                }
            }
            sum[i] = s;
            s=0;
        }

        System.out.println(Arrays.toString(sum));
    }
}
