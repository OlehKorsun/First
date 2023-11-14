public class TablicyOdKoncaDoKonca {
    public static void main(String[] args) {
        int[] tabl = {1,2,3,4,4,3,2,1};
        boolean prawda;
        for(int i = 0, j = tabl.length-1; i<j; i++, j--){
            if(tabl[i]!=tabl[j]){
                prawda = false;
                System.out.println(prawda);
                return;
            }
        }
        prawda = true;
        System.out.println(prawda);
    }
}
