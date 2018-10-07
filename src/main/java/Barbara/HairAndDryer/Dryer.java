package Barbara.HairAndDryer;

public class Dryer {


    public void dry(MyHair myHair)
    {

        //sprawdzam czy wlosy sa wysuszone (wywolujac getter na obiekcie typu MyHair ktory zostal przekazany do tej metody)

        if(myHair.isDry())
        {
            System.out.println("Twoje wlosy sa suche. Nie ma sensu je suszyc");
        }
        else
        {
            System.out.println("Twoje wlosy nie sa sluche! Trzeba je wysuszyc");
            System.out.println("Susze wlosy");

            //czynnosc suszenia wlosow doprowadza do ZMIANY stanu wlosow. Dlatego musze wywolac setter i ustawic nowa wartosc na polu 'isDry'

            myHair.setDry(true);
        }
    }
}
