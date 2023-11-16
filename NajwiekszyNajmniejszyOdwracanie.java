package Tablicy;

public class NajwiekszyNajmniejszyOdwracanie {
    public static void main(String[] args) {

        int[] tabl = {4, 3, 1, -2, 4, -2, 2, 4, 3};
        int max=tabl[0], imax=0, min=tabl[0], imin=0;

        for(int i = 0; i<tabl.length; i++){
            System.out.print(tabl[i]);
            if(i!=tabl.length-1) System.out.print(", ");

            if(tabl[i]<min){
                imin = i;
                min = tabl[i];
            }
            if(tabl[i]>=max){
                imax=i;
                max=tabl[i];
            }
        }
        System.out.println();

        tabl[imax]=min;
        tabl[imin]=max;

        for(int i = 0; i<tabl.length; i++) {
            System.out.print(tabl[i]);
            if (i != tabl.length - 1) System.out.print(", ");
        }

        for(int i = 0, j = tabl.length-1, a; j-i>0; i++, j--){
            a=tabl[i];
            tabl[i]=tabl[j];
            tabl[j]=a;
        }

        System.out.println();

        for(int i = 0; i<tabl.length; i++) {
            System.out.print(tabl[i]);
            if (i != tabl.length - 1) System.out.print(", ");
        }

    }
}
