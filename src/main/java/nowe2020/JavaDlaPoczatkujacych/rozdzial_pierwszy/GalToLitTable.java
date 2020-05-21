package nowe2020.JavaDlaPoczatkujacych.rozdzial_pierwszy;

public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int liczydlo;

        liczydlo = 0;
        for (gallons = 0; gallons <=100; gallons++){
            liters = gallons * 3.7854;
            System.out.println(gallons + "galonow to: " + liters + " litrów" );

            liczydlo++;
            if (liczydlo == 10) {
                ;
                System.out.println();
                liczydlo = 0;
            }
        }
    }
}
