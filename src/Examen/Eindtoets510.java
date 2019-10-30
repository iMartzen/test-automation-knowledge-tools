package Examen;

import java.io.*;
import java.util.concurrent.Callable;

public class Eindtoets510 {
    public static void main(String[] args) throws IOException {

        // Open invoerbestand (personen.txt)
        BufferedReader reader = new BufferedReader(new FileReader("src/ExamenOpdracht/personen.txt"));

        // Aanmaken object
        CountingAndReporting countingAndReporting = new CountingAndReporting();

        // Lees volgende regel
        String regel = reader.readLine();

        // Split regel, bepaal jaar en geslacht
        int geboorteJaar = leesVeldGeboorteJaar(regel);
        String geslacht = leesVeldGeslacht(regel);

        // Als de regel niet null is doe dan dit ..
        while (regel != null) {

            // Schrijf het geboortejaar
            countingAndReporting.writeBirthYear(geboorteJaar);

            // Schrijf het geboortejaar naar het hulpjaar
            int hulpJaar = geboorteJaar;

            // Reset de tellers
            countingAndReporting.resetCounters();

            // Als de regel niet null is en het geboortejaar overeenkomt met het hulpjaar
            while (regel != null && geboorteJaar == hulpJaar) {

                // Tel aan de hand van het geslacht
                countingAndReporting.writeGeslacht(geslacht);

                // Lees de volgende regel
                regel = reader.readLine();

                // Als de regel niet null is, kijk dan of het geboortejaar overeenkomt en tel daarbij het geslacht
                if (regel != null) {

                    // Split regel, bepaal jaar en geslacht
                    geboorteJaar = leesVeldGeboorteJaar(regel);
                    geslacht = leesVeldGeslacht(regel);
                }
            }
            // Schrijf de totalen van dat jaar
            countingAndReporting.writeCounterYear();
        }

        // Schrijf de totalen
        countingAndReporting.writeCounterTotal();
        reader.close();
    }

    // String bewerking (van string naar int geboorteJaar)
    private static int leesVeldGeboorteJaar(String persoonsgegevens) {
        String strGeboorteJaar = persoonsgegevens.split(";")[0].substring(6);
        int intGeboorteJaar = Integer.parseInt(strGeboorteJaar);
        return intGeboorteJaar;
    }

    // String bewerking
    private static String leesVeldGeslacht(String persoonsgegevens) {
        String geslacht = persoonsgegevens.split(";")[1];
        return geslacht;
    }
}
