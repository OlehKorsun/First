package Tablicy;
import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        final int size = 10;
        final int nums = 13;
        int[] arr = new int[size];
        arr[0]=(int)((Math.random()*nums)+1);
        boolean bool;
        int counter = 0;

        for(int i = 1, a; i<arr.length; i++){

            do {
                bool = false;
                a = (int) ((Math.random() * nums) + 1);
                for(int j = 0; j<arr.length; j++){
                    if(a==arr[j]) {
                        bool=true;
                        counter++;
                    }
                }
            }while(bool);
            arr[i]=a;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(counter);
    }
}
