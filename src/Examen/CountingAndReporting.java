package Examen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CountingAndReporting {

    private int aantalMannenTotaal;
    private int aantalVrouwenTotaal;
    private int aantalOnbekendTotaal;
    private int aantalMannen;
    private int aantalVrouwen;
    private int aantalOnbekend;
    private BufferedWriter writer;

    public CountingAndReporting() throws IOException {
        this.aantalMannenTotaal = 0;
        this.aantalVrouwenTotaal = 0;
        this.aantalOnbekendTotaal = 0;
        this.aantalMannen = 0;
        this.aantalVrouwen = 0;
        this.aantalOnbekend = 0;
        this.writer = new BufferedWriter(new FileWriter("src/ExamenOpdracht/output.txt"));
    }

    public void writeBirthYear(int geboorteJaar) throws IOException {
        // Schrijf geboortejaar naar console
        System.out.println("###################################");
        System.out.println("Het geboortejaar is: " + geboorteJaar);
        System.out.println("###################################");
        // Schrijf geboortejaar naar bestand
        writer.write("###################################");
        writer.write("Het geboortejaar is: " + geboorteJaar);
        writer.write("###################################");
        writer.newLine();
    }

    public void resetCounters() {
        // Hier worden de tellers opnieuw gereset
        this.aantalMannen = 0;
        this.aantalVrouwen = 0;
        this.aantalOnbekend = 0;
    }

    public void writeGeslacht(String geslacht){
        // Geslacht man, vrouw of onbekend?
        switch (geslacht.toUpperCase()) {
            case "M": {
                aantalMannen++; // Tel mannen dit jaar
                aantalMannenTotaal++; // Tel mannen totaal
                break;
            }
            case "V": {
                aantalVrouwen++; // Tel vrouwen dit jaar
                aantalVrouwenTotaal++; // Tel vrouwen totaal
                break;
            }
            default:
                aantalOnbekend++; // Tel onbekend/rest dit jaar
                aantalOnbekendTotaal++; // Tel onbekend/rest totaal
        }
    }

    public void writeCounterYear() throws IOException {
        // Schrijf tellingen dit jaar naar console
        System.out.println("###################################");
        System.out.println("Aantal mannen: " + aantalMannen);
        System.out.println("###################################");
        System.out.println("Aantal vrouwen: " + aantalVrouwen);
        System.out.println("###################################");
        System.out.println("Aantal onbekend: " + aantalOnbekend);
        System.out.println("###################################");

        // Schrijf tellingen dit jaar naar bestand
        writer.write("###################################");
        writer.write("Aantal mannen: " + aantalMannen);
        writer.write("###################################");
        writer.newLine();
        writer.write("###################################");
        writer.write("Aantal vrouwen: " + aantalVrouwen);
        writer.write("###################################");
        writer.newLine();
        writer.write("###################################");
        writer.write("Aantal onbekend: " + aantalOnbekend);
        writer.write("###################################");
        writer.newLine();
    }

    public void writeCounterTotal() throws IOException {
        // Schrijf telling in totaal naar console
        System.out.println("###################################");
        System.out.println("--- Totalen ---");
        System.out.println("###################################");
        System.out.println("Aantal mannen totaal: " + aantalMannenTotaal);
        System.out.println("###################################");
        System.out.println("Aantal vrouwen totaal: " + aantalVrouwenTotaal);
        System.out.println("###################################");
        System.out.println("Aantal onbekend totaal: " + aantalOnbekendTotaal);
        System.out.println("###################################");

        // Schrijf tellingen totaal naar bestand
        writer.write("###################################");
        writer.newLine();
        writer.write("--- Totalen ---");
        writer.write("###################################");
        writer.newLine();
        writer.write("Aantal mannen totaal: " + aantalMannenTotaal);
        writer.newLine();
        writer.write("Aantal vrouwen totaal: " + aantalVrouwenTotaal);
        writer.newLine();
        writer.write("Aantal onbekend totaal: " + aantalOnbekendTotaal);
        writer.close();
    }
}

