import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpgaveProgrammaOntwerpBesturing {
    public static void main(String[] args) {

        int[] geboorteJaar = {1954, 1958, 1958, 1963, 1963, 1963, 1964, 1970, 1970, 1970};
        // Je kan deze array ook eerst sorteren.
        String[] geslacht = {"V","M","v","m","v","V","?","v","v","m"};

        int aantalMannenTotaal = 0;
        int aantalVrouwenTotaal = 0;

        int loopTeller = 0;
        int maximumAantal = geboorteJaar.length;

        int hulpJaar = 0;

        while (loopTeller < maximumAantal) {
            System.out.println("Het geboorte jaar is " + geboorteJaar[loopTeller]);
            hulpJaar = geboorteJaar[loopTeller];

            int aantalMannen = 0;
            int aantalVrouwen = 0;

            /**
             * COMMENT THE SWITCH OR THE WHILE VOOR HETZELFDE RESULTAAT
             */

            while(loopTeller < maximumAantal && geboorteJaar[loopTeller] == hulpJaar){
                if (geslacht[loopTeller].equalsIgnoreCase("M")) {
                    aantalMannen++;
                    aantalMannenTotaal++;
                } else if (geslacht[loopTeller].equalsIgnoreCase("V")) {
                    aantalVrouwen++;
                    aantalVrouwenTotaal++;
                } else {
                    System.out.println("Onbekend geslacht: " + geslacht[loopTeller]);
                }
                loopTeller++;
            }

//            switch (geslacht[loopTeller]) {
//                case "M": case "m": {
//                    aantalMannen++;
//                    aantalMannenTotaal++;
//                }
//                case "V": case "v": {
//                    aantalVrouwen++;
//                    aantalVrouwenTotaal++;
//                }
//                default: System.out.println("Onbekend geslacht: " + geslacht[loopTeller]);
//            }
//            loopTeller++;

            System.out.println("--- Totalen ---");
            System.out.println("Aantal mannen totaal: " + aantalMannenTotaal);
            System.out.println("Aantal vrouwen totaal: " + aantalVrouwenTotaal);
        }
    }
}