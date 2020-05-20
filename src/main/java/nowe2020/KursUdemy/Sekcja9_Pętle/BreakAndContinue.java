package KursUdemy.Sekcja9_Pętle;

public class BreakAndContinue {
    public static void main(String[] args) {
        // możemy dla jakiś wartości przerwać wykonywanie pętli bądź wyłączyć specjalny warunek
        // do tego służą te pentle

        int zmienna;
        for (zmienna = 1; zmienna <= 20; zmienna++) {
            if (zmienna == 18) {
                continue;
            }
            System.out.println("Zmienna " + zmienna);
        }
        for (zmienna = 1; zmienna <= 20; zmienna += 1) {
            if (zmienna == 18) {
                break;
            }
            System.out.println("zmienna w drugiej pętli " + zmienna);
        }
        //for (;;){
//            System.out.println("Trzecia pętla ");
//        }
        for (zmienna = 1; ; zmienna += 1) {
            if (zmienna == 99) {
                break;
            }
            System.out.println("Zmienna z wartością true " + zmienna);
        }
    }
}