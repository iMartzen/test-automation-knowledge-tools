public class BackUp {
    public static void main(String[] args) {

        String[] persoonsgegevens = {"24-08-1954;V;Dijk,van;Maria", "02-03-1958;M;Groot,de;Jacob", "17-06-1958;V;Winters;Felicia", "12-01-1963;m;Swinkels;Mark", "31-07-1963;v;Deutekom,van;Lilian", "05-11-1963;V;Jacht,vander;Jolanda", "19-08-1964;?; Puffelen,van;", "22-05-1970;v; Dietvorst;Wilma", "01-06-1970;v;Boogerts,den;Ester", "19-09-1970;m; Konincks;Sven"};

        int aantalMannenTotaal = 0;
        int aantalVrouwenTotaal = 0;
        int loopTeller = 0;
        int index = 0;

        int maximumAantal = persoonsgegevens.length;
        int hulpJaar = 0;

        while (loopTeller < maximumAantal) {
            int aantalMannen = 0;
            int aantalVrouwen = 0;

            System.out.println("#############################");
            System.out.println("# Het geboorte jaar is " + leesVeldGeboorteJaar(persoonsgegevens, loopTeller) + " #");
            System.out.println("#############################");
            hulpJaar = leesVeldGeboorteJaar(persoonsgegevens, loopTeller);

            while (loopTeller < maximumAantal && leesVeldGeboorteJaar(persoonsgegevens, loopTeller) == hulpJaar) {

                if (leesVeldGeslacht(persoonsgegevens, loopTeller).equals("M")) {
                    aantalMannen++;
                    aantalMannenTotaal++;
                } else if (leesVeldGeslacht(persoonsgegevens, loopTeller).equals("V")) {
                    aantalVrouwen++;
                    aantalVrouwenTotaal++;
                } else {
                    System.out.println("Onbekend geslacht: " + leesVeldGeslacht(persoonsgegevens, loopTeller));
                }
                loopTeller++;
            }
            System.out.println("Aantal mannen totaal: " + aantalMannen);
            System.out.println("Aantal vrouwen totaal: " + aantalVrouwen);
            System.out.println();
        }

        System.out.println("--- Totalen ---");
        System.out.println("Aantal mannen totaal: " + aantalMannenTotaal);
        System.out.println("Aantal vrouwen totaal: " + aantalVrouwenTotaal);
        System.out.println();
    }

    private static int leesVeldGeboorteJaar(String[] persoonsgegevens, int loopTeller) {
        String[] enkelPersoon = persoonsgegevens[loopTeller].split(";");
        String geboorteDatum = enkelPersoon[0];
        String geboorteJaarString = geboorteDatum.substring(geboorteDatum.length() - 4);
        int geboorteJaar = Integer.parseInt(geboorteJaarString);
        return geboorteJaar;
    }

    private static String leesVeldGeslacht(String[] persoonsgegevens, int loopTeller) {
        String[] enkelPersoon = persoonsgegevens[loopTeller].split(";");
        String geslacht = enkelPersoon[1].toUpperCase();
        return geslacht;
    }
}
