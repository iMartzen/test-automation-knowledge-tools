package opdracht415;

public class Auto {
    private int actueleSnelheid = 130;
    private int gewensteSnelheid = 0;

    public Auto(){};
    public Auto(int actueleSnelheid, String merk, int Aantaldeuren){
        this.actueleSnelheid = actueleSnelheid;
    }

    //SET ACTUELE SNELHEID
    public void setActueleSnelheid(int actueleSnelheid) {
        this.actueleSnelheid = actueleSnelheid;
    }

    //SET GEWENSTE SNELHEID
    public void setGewensteSnelheid(int gewensteSnelheid) {
        this.gewensteSnelheid = gewensteSnelheid;
    }

    //GET ACTUELE SNELHEID
    public int getActueleSnelheid() {
        return actueleSnelheid;
    }

    //GET GEWENSTE SNELHEID
    public int getGewensteSnelheid() {
        return gewensteSnelheid;
    }

    public void verlaagSnelheid(int parameterWaarde) {
        actueleSnelheid -= parameterWaarde;
        System.out.println("Actuele snelheid + " + parameterWaarde + " = " + actueleSnelheid);
    }

    public void verhoogSnelheid(int parameterWaarde) {
        actueleSnelheid += parameterWaarde;
        System.out.println("Actuele snelheid + " + parameterWaarde + " = " + actueleSnelheid);
    }
}

