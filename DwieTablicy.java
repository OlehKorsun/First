package Tablicy;

import java.util.Arrays;

public class DwieTablicy {
    public static void main(String[] args) {

        int[] tabl1 = new int[5];
        double[] tabl2 = new double[5];

        for(int i = 0; i<tabl1.length; i++){
            tabl1[i] = (int)(Math.random()*50);
            tabl2[i] = Math.random()*50;
        }
        
        System.out.println(Arrays.toString(tabl1));
        System.out.println(Arrays.toString(tabl2));
        System.out.println();

        double sum;
        int a1, imin;
        double a2, min2 = tabl2[0];

        for(int i = 0; i < tabl1.length; i++){
            sum = tabl1[i] + tabl2[i];
            imin=i;
            for(int j = i+1; j < tabl1.length; j++){
                if(sum>tabl1[j]+tabl2[j]){
                    imin = j;
                    sum = tabl1[imin] + tabl2[imin];
                }
            }

            a1 = tabl1[i];
            tabl1[i] = tabl1[imin];
            tabl1[imin] = a1;

            a2 = tabl2[i];
            tabl2[i] = tabl2[imin];
            tabl2[imin] = a2;


        }

        System.out.println(Arrays.toString(tabl1));
        System.out.println(Arrays.toString(tabl2));

    }
}
