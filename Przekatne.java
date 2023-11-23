import java.util.Arrays;

public class Przekatne {
    public static void main(String[] args) {

        float[][] tabl = new float[8][8];
        for(int i = 0; i<tabl.length; i++){
            for(int j = 0; j<tabl[i].length; j++){
                tabl[i][j] = (float)(Math.random()*25 + 1);
            }
            System.out.println(Arrays.toString(tabl[i]));
        }

        float przekatnaLewa = 0;
        float przekatnaPrawa = 0;

        for(int i = 0; i<tabl.length; i++){
            przekatnaPrawa = przekatnaPrawa + tabl[i][i];
        }
        for(int i = 0; i<tabl.length; i++){
            przekatnaLewa = przekatnaLewa + tabl[i][tabl.length-i-1];
        }

        System.out.println(przekatnaLewa);
        System.out.println(przekatnaPrawa);

    }
}
