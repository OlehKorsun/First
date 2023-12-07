import java.util.Arrays;

public class TomaszewskiZadanie1 {
    public static void main(String[] args) {
        int[] tabl = {6, 3, 8, 1, 9, 5, 10, 0, -1};
        //System.out.println(Arrays.toString(bubbleSortIt(tabl)));
        //System.out.println(Arrays.toString(bubbleSortRe(tabl, tabl.length-1)));

        int[][] tabl2 = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };
        //trans(tabl2);

        int[] tabl3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binSearch(tabl3, 0, 8, 7));
    }

    static int[] bubbleSortIt(int[] tabl){
        for(int i = tabl.length-1; i>0; i--){
            for(int j = 0; j<i; j++){
                if(tabl[j]>tabl[j+1]) {
                    int tmp = tabl[j];
                    tabl[j]=tabl[j+1];
                    tabl[j+1]=tmp;
                }
            }
        }
        return tabl;
    }

    static int[] bubbleSortRe(int[] tabl, int l){
        for(int i = 0; i<l; i++){
            if(tabl[i]>tabl[i+1]){
                int tmp = tabl[i];
                tabl[i]=tabl[i+1];
                tabl[i+1]=tmp;
            }
        }
        return l<1? tabl : bubbleSortRe(tabl, l-1);
    }

    static int[][] trans(int[][] tabl){
        for(int i = 0; i<tabl.length; i++){
            for(int j = i; j<tabl[0].length; j++){
                int tmp = tabl[i][j];
                tabl[i][j] = tabl[j][i];
                tabl[j][i] = tmp;
            }
        }
        for(int i = 0; i<tabl.length; i++){
            System.out.println(Arrays.toString(tabl[i]));
        }
        return tabl;
    }

    static int binSearch(int tabl[], int begin, int end, int value){

        if(tabl[begin]==value)
            return begin;
        if(tabl[end]==value)
            return end;

        if(end<=begin || end == begin+1)
            return -1;
        if(value==tabl[(end+begin)/2])
            return (end+begin)/2;
        else if(value<tabl[(end+begin)/2])
            return binSearch(tabl, begin, (end+begin)/2, value);
         return binSearch(tabl, (end+begin)/2, end , value);
    }
}
