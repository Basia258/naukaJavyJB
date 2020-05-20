package stare2018.Barbara.interfejsy.Owoce;

public class KoszyczekMain {


    public static void main(String[] args) {

        Koszyczek koszykNaOwoce = new Koszyczek();

        // DOBRE PODEJSCIE -> INTERFEJSY

        koszykNaOwoce.setOwocWKoszyczku(new Gruszka("Z ogonkiem"));
        koszykNaOwoce.setOwocWKoszyczku(new Jablko("Chempion"));
        koszykNaOwoce.setOwocWKoszyczku(new Pomarancz("Slodka"));









        // ZLE PODEJSCIE

//        koszykNaOwoce.setJabuszkoWKoszyku(new Jablko("Chempion"));
//        koszykNaOwoce.setGruszkaWKoszyku(new Gruszka("Bez ogonka"));
//        koszykNaOwoce.setPommaranczWKoszku(new Pomarancz("Slodka"));


//        System.out.println("W koszyczku mam jablko rodzaju: " + koszykNaOwoce.getJabuszkoWKoszyku().getRodzaj());
//        System.out.println("W koszyczku mam gruszke rodzaju: " + koszykNaOwoce.getGruszkaWKoszyku().getRodzaj());
//        System.out.println("W koszyczku mam pomarancz rodzaju: " + koszykNaOwoce.getPommaranczWKoszku().getRodzaj());


    }

}
