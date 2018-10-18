package Barbara.Kompozycja;

public class Szkola {
    private Nauczyciel teacher;
    public void ucz () {

        this.teacher.ucz();
    }

    public void setTeacher(Nauczyciel teacher) {
        this.teacher = teacher;
    }
}
