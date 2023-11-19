package Tablicy;

public class OdwracanieKolejnosciLiczb {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 7, 8};

        for(int i = (arr.length/2)-1, j = 0, a; i-j>0; i--, j++){
            a = arr[i];
            arr[i] = arr[j];
            arr[j] = a;
        }

        System.out.println(Arrays.toString(arr));
    }
}
