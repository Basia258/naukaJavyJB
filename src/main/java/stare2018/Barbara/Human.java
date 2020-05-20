package stare2018.Barbara;

public class Human {

    private String name;
    private int age;
    private boolean isAdult;

    //konstructor
    public Human(String name, int age, boolean isAdult)
    {
        this.name = name;
        this.age = age;
        this.isAdult = isAdult;
    }

    //getter
    public int getAge()

    {
        return this.age;
    }

    public String getName()
    {
        return this.name;

    }
    public boolean isAdult()
    {
        return this.isAdult;
    }
    //setter
    public void setName(String name)
    {

        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public void setAdult(boolean isAdult) {
        this.isAdult = isAdult;
    }
}
