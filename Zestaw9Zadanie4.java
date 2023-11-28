public class Zestaw9Zadanie4 {
    public static void main(String[] args) {
        int[][] tabla = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 7, 5, 3},
                {8, 6, 4, 2} };

        int[][] tablb = {
                {1, 2, 3, 4, 5},
                {5, 6, 7, 8, 9},
                {9, 7, 5, 3, 1},
                {8, 6, 4, 2, 0},
                {0, 4, 6, 4, 0} };


        System.out.println("Array a - original");
        printMatrix(tabla);
        int[][] b = rotateMatrix(tabla);
        System.out.println("Array a - rotated");
        printMatrix(b);

        System.out.println();

        System.out.println("Array b - original");
        printMatrix(tablb);
        int[][] c = rotateMatrix(tablb);
        System.out.println("Array b - rotated");
        printMatrix(c);
    }

    static void printMatrix(int[][] tabl) {
        for (int i = 0; i < tabl.length; i++) {
            for (int j = 0; j < tabl[i].length; j++) {
                System.out.print(tabl[i][j] + ", ");
            }
            System.out.println();
        }
    }

    static public int[][] rotateMatrix(int[][] tabl){

        for(int i = 0; i<tabl.length; i++){
            for(int j = 0; j<i; j++) {
                int temp = tabl[i][j];
                tabl[i][j] = tabl[j][i];
                tabl[j][i] = temp;
            }
        }

        for(int i = 0; i<tabl.length; i++){
            for(int j = 0; j<tabl.length/2; j++){
                int temp = tabl[i][j];
                tabl[i][j] = tabl[i][tabl.length-1-j];
                tabl[i][tabl.length-1-j] = temp;
            }
        }

        return tabl;
    }
}
