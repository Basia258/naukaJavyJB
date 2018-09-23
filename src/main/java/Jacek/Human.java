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

        public int getAge(int age){
            return age;
    }

    public float getWeight(float weight) {
        return weight;
    }

    public boolean isAdult(boolean isAdult) {
        return isAdult;
    }

}
