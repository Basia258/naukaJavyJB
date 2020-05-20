package stare2018.Barbara;

public class Dog {
    private String name;
    private int age;
    private double weight;
    private boolean isDangerous;

    public Dog (String name, int age, double weight, boolean isDangerous)
    {this.name = name;
    this.age = age;
    this.weight = weight;
    this.isDangerous = isDangerous;
    }
        public String getName() { return this.name; }
        public int getAge() { return this.age; }
        public double getWeight(){ return this.weight; }
        public boolean isDangerous(){ return this.isDangerous; }


        public String TellHisName(String name) {return "His name is" + name;

    }
    public void setDangerous () {this.isDangerous = false;}
}
