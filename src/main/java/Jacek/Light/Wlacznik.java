package Jacek.Light;

public class Wlacznik {
    private boolean jestWlaczony;

    public void wlacz () {
        this.jestWlaczony = true;
    }
    public void wylacz () {
        this.jestWlaczony = false;
    }

  public void zapalZarowke() {
      if (this.jestWlaczony) {
          if Zarowka jestZapalony();{
              System.out.println("pale sie juz");
          } else {
              System.out.println("zaraz sie zapale");
          }      }
    }


}