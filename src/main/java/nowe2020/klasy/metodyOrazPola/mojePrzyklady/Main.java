package nowe2020.klasy.metodyOrazPola.mojePrzyklady;

public class Main {
    public static void main(String[] args) {
        Skarbonka swinkaSkarbonka = new Skarbonka();
        Rodzic mamaDziecka = new Rodzic();
        int kieszonkowe = mamaDziecka.kieszonkowe(swinkaSkarbonka, 30);
        System.out.println(kieszonkowe);
        swinkaSkarbonka.setIloscWSkarbonce(kieszonkowe);
        System.out.println(swinkaSkarbonka.getIloscWSkarbonce());
        kieszonkowe = mamaDziecka.kieszonkowe(swinkaSkarbonka,30);
        swinkaSkarbonka.setIloscWSkarbonce(kieszonkowe);
        System.out.println(swinkaSkarbonka.getIloscWSkarbonce());
        kieszonkowe = mamaDziecka.kieszonkowe(swinkaSkarbonka,90);
        swinkaSkarbonka.setIloscWSkarbonce(kieszonkowe);
        System.out.println(swinkaSkarbonka.getIloscWSkarbonce());

    }
}
