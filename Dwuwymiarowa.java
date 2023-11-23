import java.util.Arrays;

public class Dwuwymiarowa {
    public static void main(String[] args) {

        int[] a = new int[(int)(Math.random() * 5 + 1)];
        int[] b = new int[(int)(Math.random() * 6 + 1)];
        int[] c = new int[(int)(Math.random() * 7 + 1)];

        for(int i = 0; i<a.length; i++){
            a[i] = (int)(Math.random() * 25 + 1);
        }
        for(int i = 0; i<b.length; i++){
            b[i] = (int)(Math.random() * 25 + 1);
        }
        for(int i = 0; i<c.length; i++){
            c[i] = (int)(Math.random() * 25 + 1);
        }

        int[][] tabl = {a, b, c};

        System.out.println(Arrays.deepToString(tabl));    // deep - jesli elementem tablicy jest tablica, to idzie dalej i wyswietla znaczenie

    }
}
