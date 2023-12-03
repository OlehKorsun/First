package Tablicy;

public class TablicyKolkoKrzyzyk {
    public static void main(String[] args) {
        byte[][] tabl =
                { {0, 0, 1},
                  {2, 0, 2},
                  {1, 0, 0} };


        
        for(int i = 0; i< tabl.length; i++){
            for(int j = 1; j< tabl.length; j++){          // sprawdzanie poziomo
                if(tabl[i][j-1]!=tabl[i][j]) {
                    break;
                } else {
                    if(j==2 && tabl[i][j]!=0){
                        System.out.println("WINNER!");
                        return;
                    }
                }
            }
        }

        for(int j = 0; j< tabl.length; j++){
            for(int i = 1; i< tabl.length; i++){          // sprawdzanie pionowo
                if(tabl[i-1][j]!=tabl[i][j]) {
                    break;
                } else {
                    if(i==2 && tabl[i][j]!=0){
                        System.out.println("WINNER!");
                        return;
                    }
                }
            }
        }


        for(int i = 1, j = 1; i<tabl.length; i++, j++){
            if(tabl[i-1][j-1]==tabl[i][j]){
                if(i == tabl.length-1 && tabl[i][j]!=0) {
                    System.out.println("WINNER! digonal1");           // diagonal lewa gora - prawy dol
                    return;
                }
            }
        }


        for(int i = 1, j = tabl.length-1; i<tabl.length; i++, j--){     // diagonal prawa gora - lewy dol
            if(tabl[i-1][j]==tabl[i][j-1]){
                if(i == tabl.length-1 && tabl[i][j-1]!=0) {
                    System.out.println("WINNER! diagonal2");
                    return;
                }
            }
        }

        System.out.println("DEFEAT");

    }
}
