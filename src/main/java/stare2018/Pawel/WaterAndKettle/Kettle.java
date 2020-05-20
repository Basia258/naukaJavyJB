package stare2018.Pawel.WaterAndKettle;

public class Kettle {

    private boolean isOn;

    public void boilWater(Water water)
    {
        if(this.isOn)
        {
            //tu gotujemy wode
            if(water.isHot())
            {
                System.out.println("Po kij mnie gotujesz? Jestem goraca ;)");
            }
            else
            {
                System.out.println("OK! Gotujemy wode!");
                water.setHot(true);
            }
        }
        else
        {
            // wylaczony, cyzli trzeba dac komunikat
            System.out.println("Jestem wylaczony, nie bede gotowac wody");
        }



    }

    public void turnOn()
    {
        this.isOn = true;
    }

    public void turnOff()
    {
        this.isOn = false;
    }


}
