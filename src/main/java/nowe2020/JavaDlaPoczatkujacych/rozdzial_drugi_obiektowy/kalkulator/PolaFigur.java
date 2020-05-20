package JavaDlaPoczatkujacych.rozdzial_drugi_obiektowy.kalkulator;

public class PolaFigur {

//    int doPotegi(int a, int b) {
//        for (a = 1; a <= b; b++) {
//            int wynik = a;
//            wynik = (wynik * a);
//        }
//        return a;

    int poleProstokata(int bokA, int bokB) {
        if (bokA == bokB) {
            System.out.println("Jestem kwadratem");
            return bokA * bokB;
        } else return bokA * bokB;

    }

    int obwodProstokata(int bokA, int bokB) {
        if (bokA != bokB) {
            return ((2 * bokA) + (2 * bokB));
        } else {
            return bokA * 4;
        }
    }

    int poleRownolegloboku(int podstawa, int wysokosc) {
        return podstawa * wysokosc;
    }

    int obwodRownolegloboku(int bokA, int bokB) {
        if (bokA == bokB) {
            return bokA * 4;
        } else return 2 * bokA + 2 * bokB;
    }

    double poleTrojkata(int podstawa, int wysokość) {
        return (podstawa * wysokość) / 2;
    }

    double obwodTrojkata(double podstawa, double bokA, double bokB) {
        return (podstawa + bokA + bokA);
    }

    int poleTrapezu(int podstawa, int wysokosc, int drugaPodstawa) {
        return ((podstawa + drugaPodstawa) * wysokosc / 2);
    }

    int obwodTrapezu(int podstawaA, int podstawaB, int bokA, int bokB) {
        return (podstawaA + podstawaB + bokA + bokB);
    }

    double poleKola(int promien) {
        return (Math.PI * Math.sqrt(promien));
    }

    double obwodPola(int promien) {
        return (2 * Math.PI * promien);
    }

    double objetoscSzejscianu(int krawedz) {
        return (Math.sqrt(krawedz) * krawedz);
    }

    int objetoscProstopadloscianu(int krawedzPodstawyA, int krawedzPodstawyB, int wysokosc) {
        return (krawedzPodstawyA * krawedzPodstawyB * wysokosc);
    }

    int objetoscGraniastoslupa(int wysokosc) {
        return (poleProstokata(3, 4) * wysokosc);
    }

    double objetoscOstroslupa(int wysokosc) {
        return ((poleTrojkata(3, 2) * 0.3) * wysokosc);
    }

    double objetoscWalca(int promien, int wysokosc) {
        return (Math.PI * Math.sqrt(promien) * wysokosc);
    }

    double objetoscStozka(int promien, int wysokosc) {
        return (0.3 * Math.PI * Math.sqrt(promien) * wysokosc);
    }

    double objetoscKuli(int promien) {
        return ((4 / 3) * Math.PI * (Math.sqrt(promien) * promien));
    }

}



