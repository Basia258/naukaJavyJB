package nowe2020.KursUdemy.Sekcja9_Pętle;

public class PętleAndTablice {
    public static void main(String[] args) {
        int[] tab = new int[100];

        for (int i = 0; i < tab.length  ; i++) {
            tab[i] = i;
        }
        System.out.println(tab[9]);
        for (int i = 0; i <= tab.length - 1; i++) {
            System.out.println("tab " + i + ": " + tab[i]);
        }
    }



}


