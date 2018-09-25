package Jacek;
//pierwszy wersj jest to deklaracja pakietu

public class Human {

    // null
    private String name;
    // 0
    private int age;
    // 0
    private double weight;
    // false
    private boolean isAdult;


    public Human(String name, int age, double weight, boolean isAdult) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isAdult = isAdult;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge()
    {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean isAdult() {
        return this.isAdult;
    }

    public String getName(){
        return this.name;
    }

    public String introduceMyself(String name) {
        return "Mam na imie " + name;
    }
}
