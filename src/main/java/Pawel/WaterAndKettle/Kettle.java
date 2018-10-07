package Pawel.WaterAndKettle;

public class Kettle {

    private boolean isOn;

    public void boilWater(Water dupapapapapapappa)
    {
        if(this.isOn)
        {
            //tu gotujemy wode
            System.out.println("OK! Gotujemy wode!");
            dupapapapapapappa.setHot(true);
        }
        else
        {
            // wylaczony, cyzli trzeba dac komunikat
            System.out.println("Jestem wylaczony, nie bede gotowac wody");
        }



    }




}
