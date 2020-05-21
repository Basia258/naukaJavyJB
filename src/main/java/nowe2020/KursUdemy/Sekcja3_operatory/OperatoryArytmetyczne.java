package nowe2020.KursUdemy.Sekcja3_operatory;

public class OperatoryArytmetyczne {
    public static void main(String[] args) {
        /* ang. arithmetic operators
        Śą one takie same jak w matematyce i są wykorzystywane znaki
        dodawanie +
        odejmowanie -
        mnożenie *
        dzielenie /
        reszta z dzielenia %
         */
        System.out.println("Oto przykładowe operacje arytmetyczne w java");
        System.out.println("dodawanie " + (3 + 5));
        System.out.println("odejmowanie " + (7 - 4 ));
        System.out.println("mnożenie " + (2 * 4));
        System.out.println("dzielenie " + (5 / 2 ));
        System.out.println("reszta po przecinku " + (10 % 3));

        // możemy te operacje dokonywać na zmiennych
        int a = 10;
        int b = 2;

        int dodawanie = a + b;
        System.out.println("dodawanie " + dodawanie);
        int odejmowanie = a - b;
        System.out.println("odejmowanie " + odejmowanie);
        int mnożenie = a * b;
        System.out.println("mnożenie " + mnożenie);
        int dzielenie = a / b;
        System.out.println("dzielenie " + dzielenie);
        int resztaZDzielenia = a % b;
        System.out.println("dzielenie z resztą " + resztaZDzielenia);

        // Trzea uważać przy dzieleniu gdy zmieni się typ.
        double ab = 9;
        double bb = 2;


        double dzielenie1 = ab / bb;
        System.out.println("dzielenie " + dzielenie1);
        double resztaZDzielenia2 = ab % bb;
        System.out.println("dzielenie z resztą " + resztaZDzielenia2);

        a = a + b; //jest to modyfikacja zmiennej a
        System.out.println("a = a + b " + a);
        // taką operacje możemy zapisać w sposób skrócony
        a += b; // to będzie to samo jak u góry
        System.out.println("a = a + b; " + a);
        a -= b;
        System.out.println("a = a - b " + a);
        a *= b;
        System.out.println("a = a / b " + a);
        a /= b;                                 // ważna jest kolejność
        System.out.println("a = a / b " + a);

        // inkrementacja - zwiększenie wartości a o 1  a++;
        // dekrementacja - zmniejszenie wartości o jeden a--;
        // ++a; - tu najpierw następuje zwiększenie a potem pobiera się wartość
        // --a; - tu najpierw następuje zmniejszenie a potem pobiera się wartość
        a = a + 1;
        System.out.println("wartość dla a: " + a);
        a += 1;
        System.out.println("wartość dla a " + a) ;
        a++;
        System.out.println("wartość dla a " + a);
    }
}
