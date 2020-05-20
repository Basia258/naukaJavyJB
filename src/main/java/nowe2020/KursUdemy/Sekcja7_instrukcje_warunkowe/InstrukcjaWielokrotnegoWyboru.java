package KursUdemy.Sekcja7_instrukcje_warunkowe;

public class InstrukcjaWielokrotnegoWyboru {
    public static void main(String[] args) {
        // ang. switch
        /*Ma on trudniejszą składnie niż if.
        switch (zmienną, bądź warunek?) następnie, {} w których wpisujemy słowo case oraz warunek jaki ma zostać spełniony
        gdy pojawi się więkcej case-ów to wtedy jeśli któryś z nich zostanie zpełniony później każdy następny będzie wykonany
         */
        //instrukcje warunkowe stosujemy tylko to typów prymitywnych

        int zmienna = 5
                ;
        switch (zmienna){
            case 1:
                System.out.println("Jeden");
            case 2:
                System.out.println("Dwa");
            case 3:
                System.out.println("Trzy");
            case 4:
                System.out.println("Cztery");
            default:
                System.out.println("Nie spełnili moich wcześniejszych warunków");
            }

            char pojedynczyZnak = 'b';
            switch (pojedynczyZnak){
                case 'a':
                    System.out.println("jestem małym a");
                    break;
                case 'A':
                    System.out.println("jestem dużym A");
                default:
                    System.out.println("nie jestem małym a");
            }
        System.out.println("Bedzie wykonywany if");

            if (zmienna ==1){
                System.out.println("Jestem 1");
            }else if (zmienna == 2){
                System.out.println("Jestem 2");
            }else if (zmienna == 3){
                System.out.println("Jestem 3");
            }else {
                System.out.println("Te liczby nie są mi znane");
            }
        System.out.println("Kalendarz");

            int miesiąc = 5;

            switch (miesiąc){
                case 1:
                    System.out.println("styczeń");
                case 2:
                    System.out.println("luty");
                case 3:
                    System.out.println("marzec");
                case 4:
                    System.out.println("kwiecień");
                case 5:
                    System.out.println("maj");
                case 6:
                    System.out.println("czerwiec");
                case 7:
                    System.out.println("lipiec");
                case 8:
                    System.out.println("sierpień");
                case 9:
                    System.out.println("wrzesień");
                case 10:
                    System.out.println("październik");
                case 11:
                    System.out.println("listopad");
                case 12:
                    System.out.println("grudzień");
            }
        // żeby przerwać wykonanie kolejnych case-ów należy dać komende break;
        // możemy równięż tak że jeśli nie zostanie spełniony żaden case wykonana bedzie inna instrukcja
        // default jest tym samy co else przy instrukcjach warunkowych
        /*
        int innaZmienna = 2
                ;
        switch (innaZmienna){
            case 1:
                System.out.println("Jeden");
            case 2:
                System.out.println("Dwa");
                break;
            case 3:
                System.out.println("Trzy");

        int innaZmienna3 = 5;

        switch (innaZmienna3){
            case 12:
                System.out.println("Jeden");
            case 22:
                System.out.println("Dwa");
            default:
                System.out.println("Nie spełnili moich wcześniejszych warunków");

        }

        }*/

    }
}
