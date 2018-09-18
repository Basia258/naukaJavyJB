package Barbara;

public class MainHuman {

    //psvm
    public static void main(String[] args) {

        Human jan = new Human("Jan");

        System.out.println(jan.getAge());
        System.out.println(jan.getName());

        jan.setAge(15);

        System.out.println(jan.getAge());
    }
}
