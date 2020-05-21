package nowe2020.KursUdemy.Sekcja9_Pętle;

public class While {
    public static void main(String[] args) {
        // trzeba ją zainicjalizować przed jej początkiem
        // przed końcem dobiegu pętli trzeba zwiększyć zmienną liczenia

        int liczenie = 12;
        while (liczenie <= 10) {
            System.out.println("tekst " + liczenie);
            liczenie += 1;
        }
        // Ta pętla najperw wykona a potem sprawdzi
        liczenie = 12;
        do {
            System.out.println("Teks z do while " + liczenie);
            liczenie++;
        } while (liczenie <= 10);
    }
}
