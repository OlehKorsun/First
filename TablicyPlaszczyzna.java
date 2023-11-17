package Tablicy;

public class TablicyPlaszczyzna {
    public static void main(String[] args) {
        int[] x = {3, 6, 8, 13, 5};
        int[] y = {1, 5, 10, 4, 20};

        int max_x = x[0], max_y = y[0], min_x = x[0], min_y = y[0];

        for(int i = 0; i<x.length; i++){
            if(x[i]>max_x){
                max_x = x[i];
            }
            if(x[i]<min_x){
                min_x = x[i];
            }
            if(y[i]>max_y){
                max_y = y[i];
            }
            if(y[i]<min_y){
                min_y = y[i];
            }
        }

        System.out.println("max x: " + max_x + "; min x: " + min_x + "; max y: " + max_y + "; min y: " + min_y);

        int wysokosc = max_y - min_y;
        int szerokosc = max_x - min_x;
        double centr_x = szerokosc/2;
        double centr_y = wysokosc/2;

        System.out.println("Wysokosc: " + wysokosc + "; szerokosc: " + szerokosc + '\n' + "Centr: " + centr_x + " " + centr_y);

    }
}