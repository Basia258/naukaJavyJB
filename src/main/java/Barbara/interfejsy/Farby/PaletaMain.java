package Barbara.interfejsy.Farby;

public class PaletaMain
{
    public static void main(String[] args)
    {
        Paleta paletaNafarby = new Paleta();

        paletaNafarby.setFarbaWpalecie(new FarbaZielona("zielona"));
        paletaNafarby.setFarbaWpalecie(new FarbaCzerwona("czerwona"));
        paletaNafarby.setFarbaWpalecie(new FarbaNiebieska("niebieska"));




    }

}
