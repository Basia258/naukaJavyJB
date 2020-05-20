package stare2018.Jacek.Kompozycja.Lampa;

public class Lampa {
    private Zarowka malaZarowka;

    public void swiec(){
        malaZarowka.swiec();
    }
   public void setMalaZarowka(Zarowka dupa){
        this.malaZarowka = dupa;
    }


    public static class MainZARandLAM {
        public static void main(String[] args) {
            Zarowka nowaZarowka = new Zarowka();
            Lampa nowaLampa = new Lampa();
        nowaLampa.setMalaZarowka(nowaZarowka);
        nowaLampa.swiec();

        }
    }
}
