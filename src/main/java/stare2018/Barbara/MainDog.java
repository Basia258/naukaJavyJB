package stare2018.Barbara;

public class MainDog {

    public static void main (String[] args){

        Dog kajtek = new Dog ( "Kajtek", 6, 4.5, false);

        System.out.println (kajtek.getName());
        System.out.print ("He is");
        System.out.println (kajtek.getAge());
        System.out.print ("His weight is");
        System.out.println (kajtek.getWeight());
        System.out.print ("Is he dangerous?");
        System.out.println (kajtek.isDangerous());
    }
}
