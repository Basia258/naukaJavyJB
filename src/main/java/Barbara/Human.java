package Barbara;

public class Human {

    private String name;
    private int age;

    //konstructor
    public Human(String szufladkaDoPrzechowaniaTymczasowegoImienia)
    {
        this.name = szufladkaDoPrzechowaniaTymczasowegoImienia;
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

    //setter
    public void setAge(int dupa)
    {

        this.age = dupa;
    }
}
