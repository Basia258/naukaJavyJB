package Jacek;
//pierwszy wersj jest to deklaracja pakietu

public class Human {

    private String name;
    private int age;
    private float weight;
    private boolean isAdult;

    public String introduceMyself(String name) {
        return "My name is " + name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isAdult() {
        return isAdult;
    }
}
