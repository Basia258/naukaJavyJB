package Jacek.Light;

public class Wlacznik {
    private boolean jestWlaczony;

    public void wlacz () {
        this.jestWlaczony = true;
    }
    public void wylacz () {
        this.jestWlaczony = false;
    }

  public void zapalZarowke(Zarowka dupa) {
      if (this.jestWlaczony) {
          if (dupa.jestZapalona ()) {
              System.out.println("pale sie juz");
          } else {
              System.out.println("zaraz sie zapale");
          }
      }
    }


}