package nowe2020.klasy.metodyOrazPola.Powtorka;

public class Pilot {

    public boolean wlaczLubWylacz (Telewizor samsung){
        if (samsung.On == false){
            samsung.setOn();
        }
        else {
            samsung.setOff();
        }
        return samsung.On;
    }

}
