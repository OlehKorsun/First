import java.util.Arrays;

public class Zestaw10Zadanie6 {
    public static void main(String[] args) {
        int[][] tabl = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {4, 5, 6, 7},
        };
        System.out.println("Czy prostokatna: " + prostokat(tabl));
        System.out.println("Czy kwadratowa: " + kwadrat(tabl));
        System.out.println("Czy symetryczna: " + symetric(tabl));

        int[][] tabl2 = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {4, 5, 6, 7}
        };
        System.out.println("Czy rowny ksztalt: " + rozmiar(tabl, tabl2));
        System.out.println("Czy sa rowne: " + rowne(tabl, tabl2));
    }

    public static boolean prostokat(int[][] tabl){
        boolean isRectangular = true;
        for(int i = 0; i<tabl.length-1; i++){
            if(tabl[i].length!= tabl[i+1].length){
                isRectangular=false;
            }
        }
        return isRectangular;
    }

    public static boolean kwadrat(int[][] tabl){
        boolean isSquare = true;
        for(int i = 0; i< tabl.length; i++){
            if(tabl.length!=tabl[i].length){
                isSquare=false;
            }
        }
        return isSquare;
    }

    public static boolean symetric(int[][] tabl){
        boolean sym = true;

        for(int i = 0; i< tabl.length; i++){
            if(tabl.length!=tabl[i].length){
                sym=false;
            }
        }

        for(int i = 0; i< tabl.length; i++){
            for(int j = 0; j<tabl.length; j++){
                if(tabl[i][j]!=tabl[j][i]){
                    sym=false;
                }
            }
        }
        return sym;
    }

    public static boolean rozmiar(int[][] tabl1, int[][] tabl2){
        boolean isSameShape = true;

        if(tabl1.length != tabl2.length){
            isSameShape=false;
        }
        for(int i = 0; i < tabl1.length && i < tabl2.length; i++){
            if(tabl1[i].length!=tabl2[i].length){
                isSameShape=false;
            }
        }
        return isSameShape;
    }

    public static boolean rowne(int[][] tabl1, int[][] tabl2){
        boolean isSame = true;
        if(tabl1.length != tabl2.length){
            isSame=false;
            return isSame;
        }
        for(int i = 0; i < tabl1.length && i < tabl2.length; i++){
            if(tabl1[i].length!=tabl2[i].length){
                isSame=false;
                return isSame;
            }
        }

        for(int i = 0; i<tabl1.length; i++){
            for(int j = 0; j<tabl1[i].length; j++){
                if(tabl1[i][j] != tabl2[i][j]){
                    isSame=false;
                }
            }
        }
        return isSame;
    }
}