import java.net.SocketTimeoutException;

import static java.lang.Math.max;

public class OpgaveConstantenVariabelen {
    public static void main(String[] args) {

        //        Initialisatie
        int uren = 40;
        double uurloon = 41.30;
        double bruto = 0;
        double netto = 0;
        double belast = 330.40;
        int aantal = 0;
        double som = 1620;
        double uitkomst = 0;
        int grootste = 0;
        int x = 9;
        int x1 = 5;
        int x2 = 7;
        int getal = 3;

        //     Doe de berekeningen
        bruto = uren * uurloon;

        System.out.println("bruto = uren * uurloon: " + bruto);

        netto = bruto - belast;
        System.out.println("netto = bruto - belast: " + netto);

        aantal = aantal + 1;
        System.out.println("aantal = aantal + 1: " + aantal);

        som = som / aantal;
        System.out.println("som = som / aantal: " + som);

        uitkomst = Math.sqrt(x);
        System.out.println("uitkomst = wortel(x): " + uitkomst);

        uitkomst = Math.sqrt(x) + 2;
        System.out.println("uitkomst = wortel(x) + 2: " + uitkomst);

        grootste = max(x1, x2);
        System.out.println("grootste = max(x1,x2): " + grootste);

        som = som + getal;
        System.out.println("som = som + getal: " + som);
    }
}
