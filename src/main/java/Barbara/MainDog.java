package Barbara;

public class MainDog {

    public static void main (String[] args){

        Dog kajtek = new Dog (name: "Kajtek", age: 6, weight: 4.5, isDangerous: false);

        System.out.println(kajtek.getName());
        System.out.print ("He is");
        System.out.print (kajtek.getAge());
        System.out.print ("His weight is");
        System.out.print (kajtek.getWeight());
        System.out.print ("Is he dangerous?");
        System.out.print (kajtek.isDangerous());
    }
}
