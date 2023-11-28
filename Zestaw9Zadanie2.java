public class Zestaw9Zadanie2 {
    public static void main(String[] args) {
        int[][] tabl = { {1, 4, 7}, {6, 9, 1}, {10, 0, 5}, {7, 1, 5} };
        System.out.println("Glowna: " + fun1(tabl));
        System.out.println("Kolumna: " + fun2(tabl));
    }

    public static int fun1(int[][] tabl){
        int sumMax = 0, imax=0, sum = 0;

        for(int i = 0; i<tabl.length; i++){
            for(int j = 0; j<tabl[i].length; j++){
                sum+=tabl[i][j];
            }
            if(sum>sumMax){
                sumMax = sum;
                imax=i;
            }
            sum = 0;
        }
        System.out.println("fun2: " + sumMax + "  " + imax);
        return imax;
    }

    public static int fun2(int[][] tabl){
        int sumMax = 0, sum = 0, imax = 0, g=0;

        for(int i = 0; i<tabl[i].length; i++){
            for(int j = 0; j<tabl.length; j++){
                sum += tabl[j][i];
            }

            if(sum>sumMax){
                sumMax = sum;
                imax = i;
            }
            sum = 0;
        }
        System.out.println("fun2: " + sumMax + "  " + imax);
        return imax;
    }
}
