package nowe2020.klasy.metodyOrazPola.Powtorka;

public class Telewizor {

    boolean On = false;

    public void setOn (){
        this.On = true;
        System.out.println("telewizor włączony. Wybierz program");
    }

    public void setOff (){
        this.On = false;
        System.out.println("Telewizor wyłączony");
    }
    public void program (int program){
        System.out.println("wyświetlam program" + program);
    }


}
