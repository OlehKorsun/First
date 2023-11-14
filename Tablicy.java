public class Tablicy {
    public static void main(String[] args) {
        int[] arr = {};
        double[] los = new double[10];
        for(int i = 0; i<los.length;i++){
            los[i]=(Math.random()*11);
            System.out.print(los[i] + " ; ");
        }
        System.out.println();
        for(int i =1; i<los.length; i+=2){
            System.out.print(los[i] + " ; ");
        }
        System.out.println();
        int a = 0;
        for(int i = 0; i<los.length; i++){
            a = (int) los[i];
            if(a%2!=0 && a!=0) {
                System.out.print(a + " ; ");
            }
        }

    }
}
