package Barbara.interfejsy.Zmywarka;

public class Kubek implements Naczynia
{
    private boolean brudne;

    public boolean jestBrudne() {
        return true;
    }

    public void setBrudne(boolean brudne) {
        this.brudne = brudne;
    }
}
