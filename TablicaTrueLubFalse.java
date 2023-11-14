public class TablicaTrueLubFalse {
    public static void main(String[] args) {
        boolean[] tabl = new boolean[10];
        int True = 0, False = 0;

        for(int i = 0; i<tabl.length; i++){
            int a = (int)(Math.random()*2);
            tabl[i] = a==0? false: true;
            System.out.print(tabl[i] + " ; ");
            if(tabl[i]){
                True++;
            } else {
                False++;
            }
        }
        System.out.print("True: " + True + '\n' + "False: " + False);
        boolean[] TrueTabl = new boolean[True];
        boolean[] FalseTabl = new boolean[False];

    }
}
