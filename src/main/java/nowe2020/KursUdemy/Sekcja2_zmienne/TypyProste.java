package nowe2020.KursUdemy.Sekcja2_zmienne;

public class TypyProste {
    public static void main(String[] args) {
        // ang. primitive types
        // 1 bajt = 8 bitów

        // Istnieją 4 typy całkowite
        System.out.println("Istnieją 4 typy całkowite: byte, short, int, long");
        System.out.println("Byte posiada 8 bajtów");
        byte zmiennaDlaByte;
        zmiennaDlaByte = 100;
        System.out.println("Przykładowa wartość dla zmiennej typu byte" + zmiennaDlaByte);
        System.out.println("Zakres dla typu byte wynosi od " + Byte.MAX_VALUE + " do " + Byte.MAX_VALUE);

        short zmiennaDlaShort = 200;
        System.out.println("Short posiada 16 bajtów");
        System.out.println("Przykładowa wartość dla zmiennej typu short " + zmiennaDlaShort);
        System.out.println("Zakres dla typu short wynosi od " + Short.MIN_VALUE + " do " + Short.MAX_VALUE);

        int zmiennaDlaInteger;
        zmiennaDlaInteger = 1000000;
        System.out.println("Integer posiada 32 bajty");
        System.out.println("Przykładowa wartość dla zmiennej typu integer " + zmiennaDlaInteger);
        System.out.println("Zakres dla typu integer wynosi od " + Integer.MIN_VALUE + " do " + Integer.MAX_VALUE);

        long zmiennaDlaLong = 3000000;
        System.out.println("Long posiada 64 bajty. W tym typie czasami będzie wymagała od nas maszyna dodania litery l na końcu wartości");
        System.out.println("Przykładowy zmienna dla typu long " + zmiennaDlaLong);
        System.out.println("Zakres dla typu long wynosi od " + Long.MIN_VALUE + " do " + Long.MAX_VALUE);

        // Typ dla pojedyńczego znaku to char
        char zmiennaDlaChar;
        zmiennaDlaChar = '+';
        System.out.println("Wynik badania " + zmiennaDlaChar);

        // Typy zmiennoprzecinkowe
        System.out.println("Mamy również dwa rodzaje typów zmienno przecinkowych: flouat oraz double z których double jest precyzyjnejsza");

        float zmiennaDlaFloat;
        zmiennaDlaFloat = 12.23f;
        System.out.println("Przykładowa wartość dla zmiennej typu float " + zmiennaDlaFloat);
        System.out.println("Dla tej zmiennej musimy dodać f na końcu wartości zmiennej " + zmiennaDlaFloat);

        double zmiennaDlaDouble = 12.78;
        System.out.println("Przykładowa wartość dla zmiennej typu double to: " + zmiennaDlaDouble);
        System.out.println("Czy typ double posiada zakres? sprawdzimy Double od" + Double.MIN_VALUE + " do " + Double.MAX_VALUE);

        // Ostatnim typem zmiennej jest Boolean czyli prawda czy fałsz
        boolean czyToPrawda = true;
        System.out.println("Czy to co zostało powyżej napisane jest prawdą? odpowiedź brzmi " + czyToPrawda);

    }
}
