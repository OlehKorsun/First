package Tablicy;

public class TablicyLosowanie {
    public static void main(String[] args) {
        long[] tabl = new long[10];
        tabl[0]=(long)(Math.random()*100);
        System.out.print(tabl[0] + " ; ");
        for(int i = 1; i<tabl.length; i++){
            tabl[i]=tabl[i-1]+1;
            System.out.print(tabl[i] + " ; ");
        }
        System.out.println();

        int i1,i2;
        long a;
        boolean bool = true;

        while(bool) {
            bool = false;
            i1 = (int) (Math.random() * tabl.length);
            i2 = (int) (Math.random() * tabl.length);
            a = tabl[i1];
            tabl[i1] = tabl[i2];
            tabl[i2] = a;

            for (int i = 0; i < tabl.length-1; i++) {
                if (tabl[i+1] == (tabl[i] + 1)) {
                    bool = true;
                    break;
                }
            }
        }

        for (int i = 0; i < tabl.length; i++) {
                System.out.print(tabl[i] + " ; ");
        }
    }
}
