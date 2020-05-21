package nowe2020.KursUdemy.Sekcja9_Pętle;

public class PętlaWPętli {
    public static void main(String[] args) {
        int licznik = 0;
        int [][] tablica = new int [5][10];

        for(int i = 0; i <5; i++){
            for(int j = 0; j < 10; j +=1){
                licznik++;
            tablica[i][j] = licznik;
            }
        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }
}
