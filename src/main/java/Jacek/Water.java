package Jacek;

public class Water {

    private boolean isHot;

    public Water(boolean isHot){
        this.isHot = isHot;
    }

    public boolean isHot() {
        return this.isHot = isHot;
    }
    public void gotowanie (boolean toBoil){
        this.isHot = toBoil;
    }
}
