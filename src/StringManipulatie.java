/**
 * @author TV87AF
 * @version 1.0
 * @since 14 april 2019
 */


public class StringManipulatie {


    public static void main(String[] args) {

        /**
         * Beschrijving: dit programma verwijdert 1 charachter uit de string die jij invoert
         * @param strIn is de string die je meegeeft
         * @param strDelkar voer hier het karakter in wat je er uitgefiltert wilt hebben
         * @param strOut is de uitkomst van deze bewerking
         */

        String strIn = "hello dit is een test text";
        String strDelkar = "t";
        String strOut = filter(strIn, strDelkar);
        System.out.println(strOut);

    }

    private static String filter(String strIn, String strDelkar){
        /**
         * Beschrijving: Dit is de functie waar de daadwerkelijke verwijdering plaatsvindt:
         * @param i wordt gebruikt voor initialisatie van de loop;
         * @param intLen wordt gebruikt om de een loop eindig te maken;
         * @param strIn is de string die je meegeeft;
         * @param strDelkar voert hier het karakter in wat je er uitgefiltert wilt hebben;
         * @param strKar is de uitkomst van de bewerking in de loop;
         * @param strOut is de definitieve uitkomst van deze bewerking;
         */

        int i; // wordt gebruikt voor initialisatie van de loop;
        int intLen; // wordt gebruikt om de een loop eindig te maken;
        String strKar; // is de uitkomst van de bewerking in de loop;
        String strOut; // is de definitieve uitkomst van de bewerking;

        strOut = "";
        intLen = strIn.length();
        i = 0;

        while (i < intLen){
            strKar = String.valueOf(strIn.charAt(i));
            if (!strKar.equals(strDelkar))
            {
                strOut = strOut + strKar;
            }

            i = i + 1;
        }
        return strOut;
    }
}
