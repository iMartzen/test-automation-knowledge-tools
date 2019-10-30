import java.io.*;

public class OpgaveFileInputOutput {

    public static void main(String[] args) throws IOException {

        //Open invoerbestand & open uitvoerbestand
        BufferedReader inputFile = new BufferedReader(new FileReader("src/sources/input.txt"));
        BufferedWriter outputFile = new BufferedWriter(new FileWriter("src/sources/output.txt"));

        //Declareer variabelen, tellingen op nul
        int aantalMannenTotaal = 0;
        int aantalVrouwenTotaal = 0;

        //Lees volgende regel
        String regel = inputFile.readLine();

        //C1 = regel is aanwezig
        while (regel != null) {

            //Splits regel, bepaal jaar en geslacht
            String geboorteDatum = regel.substring(6, 10);
            int geboorteJaar = Integer.parseInt(geboorteDatum);
            String geslacht = regel.substring(11, 12).toUpperCase();

            //Bewaar geboortejaar in hulpjaar
            int hulpJaar = geboorteJaar;

            //Telling van dit jaar op nul
            int aantalMannen = 0;
            int aantalVrouwen = 0;

            outputFile.write("#############################\r\n");
            outputFile.write("# Het geboorte jaar is " + hulpJaar + " #\r\n");
            outputFile.write("#############################\r\n");

            //C2 = regel is aanwezig && geboortejaar == hulpjaar
            while (regel != null && geboorteJaar == hulpJaar){

                // Geslacht 'M'
                if (geslacht.equals("M")) {

                    // Tel mannen dit jaar
                    aantalMannen++;
                    aantalMannenTotaal++;

                // Geslacht 'V'
                } else if (geslacht.equals("V")) {

                    // Tel vrouwen dit jaar
                    aantalVrouwen++;
                    aantalVrouwenTotaal++;

                // De Rest
                } else {
                    outputFile.write("Onbekend geslacht: " + geslacht + "\r\n");
                }

                //Lees volgende regel
                regel = inputFile.readLine();

                // C1 = regel is aanwezig
                if (regel != null){

                    // Splits regel, bepaal jaar en geslacht
                    geboorteDatum = regel.substring(6, 10);
                    geboorteJaar = Integer.parseInt(geboorteDatum);
                    geslacht = regel.substring(11, 12).toUpperCase();
                }
            }

            // Schrijf tellingen dit jaar
            outputFile.write("Aantal mannen totaal: " + aantalMannen + "\r\n");
            outputFile.write("Aantal vrouwen totaal: " + aantalVrouwen + "\r\n");

        }

        //Schrijf telling totaal
        outputFile.write("--- Totalen ---\r\n");
        outputFile.write("Aantal mannen totaal: " + aantalMannenTotaal + "\r\n");
        outputFile.write("Aantal vrouwen totaal: " + aantalVrouwenTotaal + "\r\n");
        outputFile.close();
        inputFile.close();
    }
}
