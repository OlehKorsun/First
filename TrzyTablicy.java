import java.util.Arrays;

public class TrzyTablicy {
    public static void main(String[] args) {
        int[] a = {2, 4, 7, 8, 10, 12, 13};
        int[] b = {15, 11, 7, 6, 3, 2, 1};

        int[] c = new int[a.length + b.length];
        int amin = 0, bmin = b.length-1;


        for(int i = 0; i<c.length; i++){

            if(amin==a.length){
                for(; i<c.length; i++) {
                    c[i] = b[bmin];
                    bmin--;
                }
                System.out.println(Arrays.toString(c));
                break;
            }

            if(bmin==-1){
                for(; i<c.length; i++) {
                    c[i] = a[amin];
                    amin++;
                }
                System.out.println(Arrays.toString(c));
                break;
            }

            if(a[amin]<=b[bmin]){
                c[i] = a[amin];
                amin++;
            } else {
                c[i] = b[bmin];
                bmin--;
            }

        }

    }
}
