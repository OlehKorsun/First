package Tablicy;

public class LiczbaArmstronga {
    public static void main(String[] args) {
        int[] arr = {153, 333, 370, 515, 407, 80};
        int potega = 0;
        double Arm = 0;

        for(int i = 0; i<arr.length; i++){

            int liczba = arr[i];

            while(liczba>0){
                liczba = liczba/10;
                potega++;
            }
            liczba = arr[i];

            while(liczba>0){
                Arm = Arm + Math.pow(liczba%10, potega);
                liczba = liczba/10;
            }
            potega = 0;

            if(Arm==arr[i]){
                System.out.println("Jest liczba Armstronga: " + arr[i] + " pod indeksem: " + i);
            } else {
                Arm = 0;
                System.out.println("Nie jest liczba Armstronga: " + arr[i] + " pod indeksem: " + i);
            }

        }

    }
}
