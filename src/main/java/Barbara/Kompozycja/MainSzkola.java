package Barbara.Kompozycja;

public class MainSzkola {

    public static void main(String[] args) {

        Nauczyciel belfer = new Nauczyciel();
        Szkola budynek = new Szkola ();

        budynek.setTeacher (belfer);
        budynek.ucz();
    }
}
