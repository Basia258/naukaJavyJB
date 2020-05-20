package stare2018.Barbara;

public class MainHuman {

    //psvm
    public static void main(String[] args) {

        Human jan = new Human("jan",15,false);

        System.out.println(jan.getAge());
        System.out.println(jan.getName());
        System.out.println(jan.isAdult());
        System.out.println("to nie jest moj brat, moj brat to");
        jan.setName("Marek");
        jan.setAge(38);
        jan.setAdult(true);
        System.out.println(jan.getName());
        System.out.println(jan.getAge());
        System.out.println(jan.isAdult());
    }
}
