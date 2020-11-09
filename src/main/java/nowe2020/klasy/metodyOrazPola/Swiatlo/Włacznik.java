package nowe2020.klasy.metodyOrazPola.Swiatlo;

public class Włacznik {
    boolean stanWłacznika = false;

    public void wlacz (){
        stanWłacznika = true;
    }

    public void zapal (Żarówka osram){
        if (stanWłacznika == false)
        {
            System.out.println("wyłączik jest wyłączony");
        }
        else {
            System.out.println("jestem włącznikiem i właśnie zostałem użyty");
            osram.swiece();
        }

    }
}
