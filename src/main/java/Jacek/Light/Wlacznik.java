package Jacek.Light;

public class Wlacznik {
    private boolean jestWlaczony;

  public void wlacz(){
      this.jestWlaczony = true;
  }
  public void wylacz(){
      this.jestWlaczony = false;
  }
  public void zapalZarowke (Wlacznik jestWlaczony){
      if (this.jestWlaczony==false) {
          System.out.println("światło sie nie pali, wlacz wlacznik");
      }
      else {
          System.out.println("Swiatlo sie pali");
      }
  }
}
