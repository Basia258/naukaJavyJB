package KursUdemy.Sekcja9_Pętle;

public class For {
    public static void main(String[] args) {
        // ang. loops
        // jeśli chcemy wykonywać jakiś proces więcej niż jeden raz
        // pętla skkłada się z
        /* for (w nawiasach są instrukcje i założenie ) {co ma się wykonywać}
        */
        // w pętli możemy zainicjalizować zmienną np:
        //for (int liczenie = 1; liczenie <= 10; liczenie++){
        //            System.out.println("Tekst " + liczenie);
        int liczenie;

        for (liczenie = 1; liczenie <= 10; liczenie++){
            System.out.println("Tekst " + liczenie);
        }
        System.out.println("Poza pętlą: " + liczenie);

    }
}
